package stepsDefinition;

import driverFactory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.MatrixPage;

public class MatrixStep {
    MatrixPage matrixPage = new MatrixPage(DriverFactory.getDriver());

    @Given("User want {string} row and {string} column in matrix")
    public void user_want_row_and_column_in_matrix(String row, String column) {
        matrixPage.defineRawAndColumnOfMatrix(row, column);
    }

    @When("User creating a two matrices")
    public void userCreatingATwoMatrices() {
        matrixPage.creatingTwoMatrices();
    }

    @Then("User print two matrices in console")
    public void user_print_two_matrices_in_console() {
        matrixPage.printMatrix();
    }

    @When("User add two matrices")
    public void user_add_two_matrices() {
        matrixPage.addTwoMatrices();
    }

    @Then("User must see {string} result matrix")
    public void user_must_see_result_matrix(String mathTask) {
        matrixPage.resultMatrix(mathTask);
    }

    @When("User subtract two matrices")
    public void userSubtractTwoMatrices() {
        matrixPage.subtractTwoMatrices();
    }

    @When("User multiply two matrices")
    public void userMultiplyTwoMatrices() {
        matrixPage.multiplyTwoMatrices();
    }

}
