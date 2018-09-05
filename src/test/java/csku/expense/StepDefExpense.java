package csku.expense;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.jupiter.api.Assertions.*;

public class StepDefExpense {
    Expense expense;

    @Before
    public void init() {
        expense = new Expense();
    }

    @When("I record type is (.*) with detail is (.*) amount (.*) baht")
    public void i_record_type_is_in (String type, String detail, double amount){
        expense.addListExpense(type, detail, amount);
    }

    @Then("total is (.*)")
    public void total_is(double total) {
        assertEquals(total, expense.showTotal());
    }

}

