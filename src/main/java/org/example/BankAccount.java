package org.example;

public class BankAccount {
    private String AccountNumber;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhoneNumber;

    public BankAccount() {
    }

    public BankAccount(String accountNumber, double balance, String customerName, String customerEmail, String customerPhoneNumber) {
        AccountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public String getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        AccountNumber = accountNumber;
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

    public double deposit(double moneyInput) {
        double newBalance = this.balance + moneyInput;
        return newBalance;
    }

    public double withdraw(double moneyWithdraw) {
        if(moneyWithdraw > this.balance) {
            System.out.println("Balance is insufficient!");
        }
        double newBalance = this.balance - moneyWithdraw;
        return newBalance;
    }


}
