package wallet;

import io.cucumber.java8.En;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class WalletSteps implements En {

    private Wallet wallet = new Wallet();
    private CashSlot cashSlot = new CashSlot();
    private Cashier cashier = new Cashier(cashSlot);

    public WalletSteps() {

        Given("I have deposited 200$ in my wallet", () -> {
            wallet.deposit(200);
            assertEquals("Incorrect wallet balance", 200, wallet.getBalance());
        });

        When("I request 30$c", () -> {
            cashier.withdraw(wallet,30);
        });

        Then("30$ should be dispensed", () -> {
            assertEquals(30, cashSlot.getContents());
        });
        Then("the balance of my wallet should be $170", () -> {
            assertEquals("Incorrect wallet balance", 170, wallet.getBalance());
        });

//withdrawal from empty

        Given("I have not deposited anything in my wallet", () -> {
            wallet.deposit(0);
            assertEquals("Incorrect wallet balance", 0, wallet.getBalance());
        });

        When("I request 20$c", () -> {
            cashier.withdraw(wallet,20);
        });

        Then("Nothing should be dispensed", () -> {
            assertEquals(0, cashSlot.getContents());
        });

//withdrawal exceeding balace

        Given("I have deposited 30$ in my wallet", () -> {
            wallet.deposit(30);
            assertEquals("Incorrect wallet balance", 30, wallet.getBalance());
        });

        When("I request 200$-", () -> {
            Cashier cashier = new Cashier(cashSlot);
            cashier.withdraw(wallet,200);
        });

        Then("Nothing should be dispensed here", () -> {
            assertEquals(0, cashSlot.getContents());
        });

//Negative deposit

        Given("I have deposited -100$ in my wallet", () -> {
            wallet.deposit(-100);
        });

        When("I check balance", () -> {

        });

        Then("No negative values should be returned", () -> {
            assertEquals("Your balance is: 0$",cashier.showBalance(wallet));
        });

//Display balance

        Given("my account has been credited with $100", () -> {
            wallet.deposit(100);
        });

        When("I check my balance", () -> {

        });

        Then("I should see that my balance is $100", () -> {
            assertEquals("Your balance is: 100$",cashier.showBalance(wallet));
        });

//Unsuccessful overdrawn

        Given("my wallet has been credited with $100", () -> {
            wallet.deposit(100);

        });

        When("I withdraw $200", () -> {
            cashier.withdraw(wallet,200);
        });

        Then("nothing should be dispensed", () -> {
            assertEquals(0,cashSlot.getContents());
        });

        Then("I should be told that I have insufficient funds in my account", () -> {
            ByteArrayOutputStream outContent = new ByteArrayOutputStream();
            PrintStream originalOut = System.out;
            System.setOut(new PrintStream(outContent));

            cashier.withdraw(wallet,200);
            assertTrue(outContent.toString().contains("Insufficient funds in Your account"));

            System.setOut(originalOut);
        });
    }
}
