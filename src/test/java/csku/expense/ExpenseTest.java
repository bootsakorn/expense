package csku.expense;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.*;

class ExpenseTest {
    Expense expense;
    Date date;

    @BeforeEach
    void init() {
        date = new Date();
        expense = new Expense();
    }

    @Test
    void addListExpenseCaseIn() {
        expense.addListExpense("in", "by mom", 500, date);
        assertEquals(500, expense.showTotal());
    }

    @Test
    void addListExpenseCaseOut() {
        expense.addListExpense("out", "KFC", 199, date);
        assertEquals(-199, expense.showTotal());
    }

    @Test
    void addListExpenseCaseInOut() {
        expense.addListExpense("in", "by mom", 500, date);
        expense.addListExpense("out", "KFC", 199 , date);
        assertEquals(301, expense.showTotal());
    }

    @Test
    void editListExpenseDetail() {
        expense.addListExpense("in", "by mom", 500, date);
        expense.editList(1, "by dad");
        assertEquals(expense.getList(1).getDetail(), "by dad");
    }

    @Test
    void editListExpenseAmount() {
        expense.addListExpense("in", "by mom", 500, date);
        expense.editList(1, 2000);
        assertEquals(expense.getList(1).getAmount(), 2000.0);
    }

    @Test
    void editListExpenseType() {
        expense.addListExpense("in", "by mom", 500, date);
        expense.editList(1, "out");
        assertEquals(expense.getList(1).getType(), "out");
    }
}