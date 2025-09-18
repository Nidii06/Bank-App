package com.nidi.bankapp;

import com.nidi.bankapp.model.BankAccount;
import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount account = null;
        
        System.out.println("=== Welcome to Java Bank ===");
        
        // Create a new account
        System.out.print("Enter account number: ");
        String accNumber = scanner.nextLine();
        
        System.out.print("Enter account holder name: ");
        String holderName = scanner.nextLine(); // FIXED: changed nextInt() to nextLine()
        
        System.out.print("Enter initial deposit: ");
        double initialDeposit = scanner.nextDouble();
        scanner.nextLine(); // FIXED: consume newline - removed the (e)
        
        account = new BankAccount(accNumber, holderName, initialDeposit);
        System.out.println("Account created successfully!");
        
        // Main menu loop
        boolean running = true;
        while (running) {
            // ... rest of your code
        }
        scanner.close();
    }
}