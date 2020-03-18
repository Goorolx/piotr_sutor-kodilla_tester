package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class BankTestSuite {
    @Test
    public void shouldReturnZeroSaldo() {
        Bank bank1 = new Bank("pekao");
            bank1.addCm2Transaction(0);
            bank1.addCm1Transaction(0);
            bank1.addCm1Transaction(0);

            double bank = bank1.getTotalSaldo();
        assertEquals(0,bank);
    }
    @Test
    public void shouldCalculateCorrectSaldo() {
        Bank bank = new Bank("Pko");
        bank.addCm1Transaction(200);
        bank.addCm1Transaction(200);
        bank.addCm1Transaction(-400);
        bank.addCm2Transaction(400);
        bank.addCm2Transaction(400);
        bank.addCm2Transaction(-100);
        bank.addCm2Transaction(0);

        double saldo = bank.getTotalSaldo();
        assertEquals(700, saldo, 0.01);
    }
    @Test
    public void shouldReturnZeroCash(){
        Bank bank1 = new Bank("pekao");
        bank1.addCm2Transaction(0);
        bank1.addCm1Transaction(0);
        bank1.addCm1Transaction(0);
    assertEquals(0,bank1.getOutAll());
    assertEquals(0,bank1.getOutAll());
    }
    @Test
    public void shouldReturnCorrectInCashCount(){
        Bank bank = new Bank("Pko");
        bank.addCm1Transaction(200);
        bank.addCm2Transaction(400);
        bank.addCm2Transaction(-400);
        bank.addCm1Transaction(400);
        bank.addCm2Transaction(00);

        assertEquals(3,bank.getInAll());
    }
    @Test
    public void shouldReturnCorrectOutCashCount(){
        Bank bank = new Bank("Pko");
        bank.addCm1Transaction(-200);
        bank.addCm2Transaction(400);
        bank.addCm2Transaction(-400);
        bank.addCm1Transaction(400);
        bank.addCm2Transaction(00);

        assertEquals(2,bank.getOutAll());
    }
    @Test
    public void shouldReturnZeroAvg() {
        Bank bank1 = new Bank("pekao");
        bank1.addCm2Transaction(0);
        bank1.addCm1Transaction(0);
        bank1.addCm1Transaction(0);
        assertEquals(0, bank1.getOutAvg());
        assertEquals(0, bank1.getInAvg());
    }
       @Test
        public void shouldReturnAvgInCash() {
        Bank bank = new Bank("Pko");
        bank.addCm1Transaction(100);
        bank.addCm2Transaction(50);
        bank.addCm1Transaction(200);
        bank.addCm2Transaction(100);
        bank.addCm2Transaction(-400);
        bank.addCm1Transaction(-450);
        bank.addCm2Transaction(00);

        assertEquals(112.5,bank.getInAvg());
        }
        @Test
    public void shouldReturnAvgOutCash(){
            Bank bank = new Bank("Pko");
            bank.addCm1Transaction(-200);
            bank.addCm2Transaction(-400);
            bank.addCm2Transaction(100);
            bank.addCm2Transaction(00);

            assertEquals(-300,bank.getOutAvg());
        }
}
