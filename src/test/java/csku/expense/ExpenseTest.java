package csku.expense;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExpenseTest {
    Expense expense;
    String listExpenseDetailEmpty = "\ntotal : 0.0";
    String listExpenseDetailNotEmpty = "1   in : by mom = 500.0\n2   out : KFC = -199.0\ntotal : 301.0";

    @BeforeEach
    void init() {
        expense = new Expense();
    }

    @Test
    void addListExpenseCaseIn() {
        expense.addListExpense("in", "by mom", 500);
        assertEquals(500, expense.showTotal());
    }

    @Test
    void addListExpenseCaseOut() {
        expense.addListExpense("out", "KFC", 199);
        assertEquals(-199, expense.showTotal());
    }

    @Test
    void addListExpenseCaseInOut() {
        expense.addListExpense("in", "by mom", 500);
        expense.addListExpense("out", "KFC", 199);
        assertEquals(301, expense.showTotal());
    }

    @Test
    void showListExpenseDetailsCaseNotEmpty(){
        expense.addListExpense("in", "by mom", 500);
        expense.addListExpense("out", "KFC", 199);
        assertEquals(listExpenseDetailNotEmpty, expense.showListExpenseDetails());
    }

    @Test
    void showListExpenseDetailsCaseEmpty(){
        assertEquals(listExpenseDetailEmpty, expense.showListExpenseDetails());
    }

}