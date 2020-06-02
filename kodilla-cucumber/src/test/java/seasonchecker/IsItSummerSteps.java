package seasonchecker;

import io.cucumber.java8.En;

import java.time.MonthDay;

import static junit.framework.TestCase.assertEquals;


public class IsItSummerSteps implements En {
    private MonthDay today;
    private String answer;

    public IsItSummerSteps() {

        Given("today is last day of December", () -> {
            // Write code here that turns the phrase above into concrete actions

            this.today = MonthDay.of(12,31);
        });
        Given("today is first day of August", () -> {
            // Write code here that turns the phrase above into concrete actions
            this.today = MonthDay.of(8,1);
        });
        Given("today is 20th of June", () -> {
            // Write code here that turns the phrase above into concrete actions
            this.today = MonthDay.of(6,20);
        });
        Given("today is 21st of June", () -> {
            // Write code here that turns the phrase above into concrete actions
            this.today = MonthDay.of(6,21);
        });

        When("I ask whether it's Summer", () -> {
            // Write code here that turns the phrase above into concrete actions
            SeasonChecker seasonChecker = new SeasonChecker();
            this.answer = seasonChecker.checkIfSummer(this.today);
        });

        Then("I should be told {string}", (String string) -> {
            // Write code here that turns the phrase above into concrete actions
            assertEquals(string, this.answer);
        });
    }
}
