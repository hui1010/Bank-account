package org.example;


import java.util.Scanner;

public class App
{
    public static void main( String[] args ) {

        final double newBalance = 0.0;

        BankAccount account = new BankAccount(newBalance, "Huiyi Skårner", "My@Email.com", "0767824509");
        System.out.println(account.getAccountNumber());

        BankAccount account2 = new BankAccount();
        System.out.println(account2.getAccountNumber());

        /*Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Welcome to the bank! Please make a bank account!");
            System.out.println("Please enter your name: ");
            String name = scanner.nextLine();
            System.out.println("Please enter your email: ");
            String email = scanner.nextLine();
            System.out.println("Please enter your phone number: ");
            String phoneNumber = scanner.nextLine();

            BankAccount account = new BankAccount(newAccountNumber, newBalance, name, email, phoneNumber);
            System.out.println("Your new account number is: " + account.getAccountNumber());
            System.out.println("Your balance is: " + account.getBalance());
            System.out.println("Your name is: " + account.getCustomerName());
            System.out.println("Your email is: " + account.getCustomerEmail());
            System.out.println("Your phone number is: " + account.getCustomerPhoneNumber());

            System.out.println("Do you want to create another account?");
            String choice = scanner.nextLine();
            if (choice.toLowerCase() == "no")
                break;
        }*/

    }
}
