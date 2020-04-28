package org.example;

public class BankAccountSequencer {
    private static int counter = 0;
    public static int nextAccountNumber() {
        return ++counter;
    }
    public static int getAccountNumber() {
        return counter;
    }
    public static void reset() {
        counter = 0;
    }
}

