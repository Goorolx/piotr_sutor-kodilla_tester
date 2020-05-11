Feature: Cash withdrawal when empty

    Scenario: Unsuccesfull withdrawal from wallet due to empty account
        Given I have not deposited anything in my wallet
        When I request 20$c
        Then Nothing should be dispensed