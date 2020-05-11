Feature: Cash withdrawal exceeding available credit

    Scenario: Unsuccesfull withdrawal from wallet due to exceeding available amount
        Given I have deposited 30$ in my wallet
        When I request 200$-
        Then Nothing should be dispensed here