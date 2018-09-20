package csku.expense;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.jupiter.api.BeforeEach;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

public class StepDefExpense {
    Expense expense;

    @Before
    public void init() {
        expense = new Expense();
    }

    @When("I record type is (.*) with detail is (.*) amount (.*) baht")
    public void i_record_type_is_in (String type, String detail, double amount){
        expense.addListExpense(type, detail, amount, new Date());
    }

    @Then("total is (.*)")
    public void total_is(double total) {
        assertEquals(total, expense.showTotal());
    }

    @Given("Give I record type is (.*) with detail is (.*) amount (.*) baht")
    public void i_record(String type, String detail, double amount){
        expense.addListExpense(type, detail, amount, new Date());
    }

    @When("I edit detail of expense list no. (//d) = (.*)")
    public void i_edit_detail (int i, String newDetail){
        expense.editList(i, newDetail);
    }

    @Then("detail is (.*)")
    public void detail_is(String newDetail) {
        assertEquals(newDetail, expense.getList(1).getDetail());
    }

    @When("I edit amount of expense list no. (//d) = (.*)")
    public void i_edit_amount (int i, String newAmount){
        expense.editList(i, newAmount);
    }

    @Then("detail is (.*)")
    public void amount_is(String newAmount) {
        assertEquals(newAmount, expense.getList(1).getAmount());
    }

    @When("I edit type of expense list no. (//d) = (.*)")
    public void i_edit_type (int i, String newType){
        expense.editList(i, newType);
    }

    @Then("type is (.*)")
    public void type_is(String newType) {assertEquals(newType, expense.getList(1).getType());
    }
}

