package com.kodilla.bank.homework;

public class Bank {
    public String name;
    public CashMachine[] cm;
    public int size;
    //public CashMachine cm2;

    public Bank(String name) {
        this.name = name;
        this.cm = new CashMachine[0];

    }

    public void addCashMachine(CashMachine cashMachine) {
        this.size++;
        CashMachine[] tempTab = new CashMachine[this.size];
        System.arraycopy(cm, 0, tempTab, 0, cm.length);
        tempTab[this.size - 1] = cashMachine;
        this.cm = tempTab;
    }

    public void addCmTransaction(int cmIndex, int value) {
        if (value != 0) {
            this.cm[cmIndex].addTransaction(value);
        }
    }

    public double getInCashCm(CashMachine cm) {
        int[] cmTransactions = cm.getTransactions();
        double sumInCm = 0;
        for (int cm1t : cmTransactions) {
            if (cm1t > 0)
                sumInCm = sumInCm + cm1t;
        }
        return sumInCm;
    }

    public int getOutCashCm(CashMachine cm) {
        int[] cmTransactions = cm.getTransactions();
        int sumOutCm = 0;
        for (int cm1t : cmTransactions) {
            if (cm1t < 0)
                sumOutCm = sumOutCm + cm1t;
        }
        return sumOutCm;
    }

    public int getInCountCm(CashMachine cm) {
        int[] cm1Transactions = cm.getTransactions();
        int countInCm1 = 0;
        for (int cm1t : cm1Transactions) {
            if (cm1t > 0)
                countInCm1++;
        }
        return countInCm1;
    }

    public int getOutCountCm(CashMachine cm) {
        int[] cm1Transactions = cm.getTransactions();
        int countOutCm = 0;
        for (int cm1t : cm1Transactions) {
            if (cm1t < 0)
                countOutCm++;
        }
        return countOutCm;
    }

    public double getInAvg() {
        double inCash = 0.0;
        double inCount = 0.0;
        Bank bank = new Bank("pko");
        for (CashMachine cm : cm
        ) {
            inCount = inCount + bank.getInCountCm(cm);
        }

        for (CashMachine cmCash : cm
        ) {
            inCash = inCash + bank.getInCashCm(cmCash);
        }
        if (inCount != 0)
            return inCash / inCount;
        else
            return 0.0;
    }

    public double getOutAvg() {
        double outCash = 0.0;
        double outCount = 0.0;
        Bank bank = new Bank("pko");
        for (CashMachine cm : cm
        ) {
            outCount = outCount + bank.getOutCountCm(cm);
        }

        for (CashMachine cmCash : cm
        ) {
            outCash = outCash + bank.getOutCashCm(cmCash);
        }
        if (outCount != 0)
            return outCash / outCount;
        else
            return 0.0;
    }

    public double getTotalSaldo() {
        double totalSaldo = 0.0;
        for (CashMachine cmSaldo : cm) {
            totalSaldo = totalSaldo + cmSaldo.getSaldo();
        }
        return totalSaldo;
    }

    public double getInAll() {
        Bank bank = new Bank("pko");
        double inAll = 0.0;
        for (CashMachine cm : cm
        ) {
            inAll = inAll + bank.getInCountCm(cm);
        }
        return inAll;
    }

    public double getOutAll() {
        Bank bank = new Bank("pko");
        double outAll = 0.0;
        for (CashMachine cm : cm
        ) {
            outAll = outAll + bank.getOutCountCm(cm);
        }
        return outAll;
    }
}




