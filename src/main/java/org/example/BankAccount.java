package org.example;

public class BankAccount {
    private int accountNumber = 9000;
    private double balance = 0.0;
    private String customerName;
    private String customerEmail;
    private String customerPhoneNumber;
    private static int counter = 0;


    public BankAccount() {
        this.accountNumber += counter;
        this.counter++;
    }

    public BankAccount(double balance, String customerName, String customerEmail, String customerPhoneNumber) {
        this.accountNumber += this.counter;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhoneNumber = customerPhoneNumber;
        this.counter++;

    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public double deposit(final double moneyInput) {
        double newBalance = this.balance + moneyInput;
        return newBalance;
    }

    public double withdraw(final double moneyWithdraw) {
        if(moneyWithdraw > this.balance) {
            System.out.println("Balance is insufficient!");
        }
        double newBalance = this.balance - moneyWithdraw;
        return newBalance;
    }
}
