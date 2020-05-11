Feature: Cash Withdrawal
    Taking money

    Scenario: Succesful withdrawal from a wallet in credit
        Given I have deposited 200$ in my wallet
        When I request 30$c
        Then 30$ should be dispensed
