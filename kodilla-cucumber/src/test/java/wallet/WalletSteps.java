package wallet;

import io.cucumber.java8.En;
import org.junit.Assert;

public class WalletSteps implements En {

    private Wallet wallet = new Wallet();
    private CashSlot cashSlot = new CashSlot();

    public WalletSteps() {

        Given("I have deposited 200$ in my wallet", () -> {
            wallet.deposit(200);
            Assert.assertEquals("Incorrect wallet balance", 200, wallet.getBalance());
        });

        When("I request 30$c", () -> {
            Cashier cashier = new Cashier(cashSlot);
            cashier.withdraw(wallet,30);
        });

        Then("30$ should be dispensed", () -> {
            Assert.assertEquals(30, cashSlot.getContents());
        });

//withdrawal from empty

        Given("I have not deposited anything in my wallet", () -> {
            wallet.deposit(0);
            Assert.assertEquals("Incorrect wallet balance", 0, wallet.getBalance());
        });

        When("I request 20$c", () -> {
            Cashier cashier = new Cashier(cashSlot);
            cashier.withdraw(wallet,20);
        });

        Then("Nothing should be dispensed", () -> {
            Assert.assertEquals(0, cashSlot.getContents());
        });

//withdrawal exceeding balace

        Given("I have deposited 30$ in my wallet", () -> {
            wallet.deposit(30);
            Assert.assertEquals("Incorrect wallet balance", 30, wallet.getBalance());
        });

        When("I request 200$-", () -> {
            Cashier cashier = new Cashier(cashSlot);
            cashier.withdraw(wallet,200);
        });

        Then("Nothing should be dispensed here", () -> {
            Assert.assertEquals(0, cashSlot.getContents());
        });

//Negative deposit

        Given("I have deposited -100$ in my wallet", () -> {
            wallet.deposit(-100);
        });

        When("I check balance", () -> {

        });

        Then("No negative values should be returned", () -> {
            Assert.assertEquals(0,wallet.getBalance());
        });
    }
}
