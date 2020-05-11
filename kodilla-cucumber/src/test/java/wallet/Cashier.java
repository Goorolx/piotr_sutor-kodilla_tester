package wallet;

public class Cashier {
    private CashSlot cashSlot;

    public Cashier(CashSlot cashSlot) {
        this.cashSlot = cashSlot;
    }

    public void withdraw(Wallet wallet, int amount) {
        if (wallet.getBalance() >= amount) {
            wallet.debit(amount);
            cashSlot.dispense(amount);
        } else
            System.out.println("Insufficient funds in Your account");
    }

    public String showBalance(Wallet wallet) {
        String message = "Your balance is: " + wallet.getBalance() + "$";
        System.out.println(message);
        return message;
    }
}
