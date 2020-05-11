Feature: Negative Deposit
    Trying to add negative deposit

    Scenario: Unsuccesful deposit using negative amount
        Given I have deposited -100$ in my wallet
        When I check balance
        Then No negative values should be returned