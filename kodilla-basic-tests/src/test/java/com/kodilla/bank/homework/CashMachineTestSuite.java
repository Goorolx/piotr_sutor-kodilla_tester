package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {
    @Test
    public void shouldHaveZeroLength() {
        CashMachine cashMachine = new CashMachine();
        int[] transaction = cashMachine.getTransactions();

        assertEquals(0, transaction.length);
    }
    @Test
    public void shouldAddTreeTransactions() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(500);
        cashMachine.addTransaction(-300);
        cashMachine.addTransaction(200);

        int[] transaction = cashMachine.getTransactions();
        assertEquals(3, transaction.length);
        assertEquals(500, transaction[0]);
        assertEquals(-300, transaction[1]);
        assertEquals(200, transaction[2]);
    }

    @Test
    public void shouldAddZeroTransactions() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(0);
        cashMachine.addTransaction(-0);

        int[] transaction = cashMachine.getTransactions();
        assertEquals(2, transaction.length);
        assertEquals(0, transaction[0]);
        assertEquals(-0, transaction[1]);
    }
    @Test
    public void shouldReturnCorrectSaldo() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(50);
        cashMachine.addTransaction(-200);
        cashMachine.addTransaction(400);

        assertEquals(250, cashMachine.getSaldo());
    }
    @Test
    public void shouldReturnTotalNumberOfTransactions() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(-50);
        cashMachine.addTransaction(50);
        cashMachine.addTransaction(200);
        cashMachine.addTransaction(400);

        //assertEquals(4,cashMachine.getNumberOfTransactions());
        assertEquals(4,cashMachine.getNumberOfTransactions());

    }
}
