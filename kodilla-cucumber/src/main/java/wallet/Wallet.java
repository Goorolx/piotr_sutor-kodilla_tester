package wallet;

public class Wallet {

    private int balance = 0;

    public Wallet() {

    }

    public void deposit(int money) {
        if (money > 0) {
            this.balance += money;
        } else
            System.out.println("Incorrect amount");
    }

    public void debit(int money) {
        if (this.balance >= money) {
            this.balance -= money;
        } else
            System.out.println("Insufficient funds in Your account");
    }

    public int getBalance() {
        return balance;
    }
}
