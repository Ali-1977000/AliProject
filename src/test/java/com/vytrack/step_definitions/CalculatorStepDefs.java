package com.vytrack.step_definitions;

import io.cucumber.java.en.*;

public class CalculatorStepDefs {



    @Given("I have calculator app open")
    public void i_have_calculator_app_open() {
        System.out.println("Running step : I have calculator app open");

    }

    @When("I add {int} to {int}")
    public void i_add_to(Integer num1, Integer num2) {
        System.out.println("Running step : I add " + num1 + " to " + num2);

    }

    @Then("I should get {int}")
    public void i_should_get(Integer expected) {
        System.out.println("Running step : Verifying the sum should be " + expected);

    }

}
