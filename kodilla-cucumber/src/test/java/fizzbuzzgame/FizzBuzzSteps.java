package fizzbuzzgame;

import io.cucumber.java8.En;

import static junit.framework.TestCase.assertEquals;

public class FizzBuzzSteps implements En {
    private int number;
    private String answer;

    public FizzBuzzSteps() {

        Given("number is 1", () -> {
            // Write code here that turns the phrase above into concrete actions
            this.number = 1;
        });
        Given("number is 2", () -> {
            // Write code here that turns the phrase above into concrete actions
            this.number = 2;
        });
        Given("number is 3", () -> {
            // Write code here that turns the phrase above into concrete actions
            this.number = 3;
        });
        Given("number is 5", () -> {
            // Write code here that turns the phrase above into concrete actions
            this.number = 5;
        });
        Given("number is 15", () -> {
            // Write code here that turns the phrase above into concrete actions
            this.number = 15;
        });
        Given("number is 16", () -> {
            // Write code here that turns the phrase above into concrete actions
            this.number = 16;
        });

        When("I ask whether it's Fizz or Buzz", () -> {
            // Write code here that turns the phrase above into concrete actions
            FizzBuzzChecker fizzBuzzChecker = new FizzBuzzChecker();
            this.answer = fizzBuzzChecker.fizzBuzzCheck(number);
        });

        Then("I should be told {string}", (String string) -> {
            // Write code here that turns the phrase above into concrete actions
            assertEquals(string, this.answer);
        });

    }
}
