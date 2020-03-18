package com.kodilla.bank.homework;

import static java.lang.Double.NaN;

public class Bank {
    public String name;
    public CashMachine cm1;
    public CashMachine cm2;

    public Bank (String name) {
        this.name = name;
        this.cm1 = new CashMachine();
        this.cm2 = new CashMachine();
    }
    public void addCm1Transaction(int value){
        if (value != 0) {
        this.cm1.addTransaction(value);
    }}
    public void addCm2Transaction(int value){
        if (value!= 0) {
            this.cm2.addTransaction(value);
        }}

        public double getInCashCm1() {
        int[] cm1Transactions = cm1.getTransactions();
        double sumInCm1 = 0;
        for (int cm1t : cm1Transactions) {
            if (cm1t > 0)
                sumInCm1 = sumInCm1 + cm1t; }
        return sumInCm1;
    }
    public double getOutCashCm1() {
        int[] cm1Transactions = cm1.getTransactions();
        double sumOutCm1 = 0;
        for (int cm1t : cm1Transactions) {
            if (cm1t < 0)
                sumOutCm1 = sumOutCm1 + cm1t;
        }
        return sumOutCm1;
    }
    public int getInCountCm1() {
        int[] cm1Transactions = cm1.getTransactions();
        int countInCm1 = 0;
        for (int cm1t : cm1Transactions) {
            if (cm1t > 0)
                 countInCm1++; }
        return countInCm1;
    }
    public int getOutCountCm1() {
        return cm1.getNumberOfTransactions() - getInCountCm1();
    }
    public double getInCashCm2() {
        int[] cm2Transactions = cm2.getTransactions();
        double sumInCm2 = 0;
        for (int cm2t : cm2Transactions) {
            if (cm2t > 0)
                sumInCm2 = sumInCm2 + cm2t;
                    }
        return sumInCm2;
    }
    public double getOutCashCm2() {
        int[] cm2Transactions = cm2.getTransactions();
        double sumCm2 = 0;
        for (int cm2t : cm2Transactions) {
            if (cm2t < 0)
                sumCm2 = sumCm2 + cm2t;
                    }return sumCm2;
    }
    public int getOutCountCm2() {
        return cm2.getNumberOfTransactions() - getInCountCm2();
    }

    public int getInCountCm2() {
        int[] cm2Transactions = cm2.getTransactions();
        int countInCm2 = 0;
        for (int cm2t : cm2Transactions) {
            if (cm2t > 0)
                countInCm2++; }
        return countInCm2;
    }
    public double getInAvg (){
        double inAvg = 0.0;
        inAvg = ((getInCashCm1() / getInCountCm1()) + (getInCashCm2() / getInCountCm2()))/2;
        if (Double.isNaN(inAvg))
            return 0;
        else
            return inAvg;
                            }

    public double getOutAvg () {
        double outAvg =0.0;
        outAvg = (getOutCashCm1()/getOutCountCm1() + getOutCashCm2()/getOutCountCm2())/2;
        if ((Double.isNaN(outAvg)))
            return 0;
        else
            return outAvg;
}

    public double getTotalSaldo (){
        return cm1.getSaldo()+cm2.getSaldo();
    }

    public int getInAll () {return (getInCountCm1()+getInCountCm2());}

    public int getOutAll () {return (getOutCountCm1()+getOutCountCm2());}
   }




