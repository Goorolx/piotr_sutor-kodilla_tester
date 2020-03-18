package com.kodilla.bank.homework;

public class CashMachine {
    private int[] transactions;
    private int size;

    public CashMachine() {
        this.size = 0;
        this.transactions = new int[0];
    }
    public void addTransaction (int value) {
            this.size++;
            int[] tempTab = new int[this.size];
            System.arraycopy(transactions, 0, tempTab, 0, transactions.length);
            tempTab[this.size - 1] = value;
            this.transactions = tempTab;
        }
    public int[] getTransactions() {
        return transactions;
    }

    public int getNumberOfTransactions() {
        int getTCount = getTransactions().length;
        return getTCount;
    }
    public int getSaldo() {
        int sum = 0;
        for (int i = 0; i < transactions.length; i++) {
                sum += this.transactions[i];
            }
        return sum;
        }

        public double getAverageIn() {
            if (this.transactions.length == 0) {
                return 0;
            }
            double sumIn = 0;
            for(int i = 0; i < this.transactions.length; i++) {
                if (this.transactions[i] < 0)
                sumIn += this.transactions[i];
            }
            return sumIn/this.transactions.length;
        }
    public double getAverageOut() {
        if (this.transactions.length == 0) {
            return 0;
        }
        double sumOut = 0;
        for(int i = 0; i < this.transactions.length; i++) {
            if (this.transactions[i] < 0)
                sumOut += this.transactions[i];
        }
        return sumOut/this.transactions.length;
    }

}