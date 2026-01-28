package com.abey.banking;

import java.util.Scanner;

public class Main {
    
    // Character-by-character typing animation
    private static void typePrint(String text, int delayMs) {
        try {
            for (char c : text.toCharArray()) {
                System.out.print(c);
                Thread.sleep(delayMs);
            }
            System.out.println();
        } catch (InterruptedException ignored) {}
    }

    // Simple delay
    private static void sleep(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException ignored) {}
    }

    // ========== MAIN PROGRAM ==========
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ---------- WELCOME ----------
        typePrint("=================================", 10);
        typePrint("   Welcome to HDFC / SBI Bank   ", 15);
        typePrint("=================================\n", 10);
        sleep(500);

        // ---------- LOGIN ----------
        System.out.print("Enter Customer ID: ");
        String id = sc.nextLine();

        System.out.print("Enter Password   : ");
        String pass = sc.nextLine();

        System.out.println();
        typePrint("Verifying credentials...", 20);
        sleep(500);

        if (!LoginService.authenticate(id, pass)) {
            typePrint("❌ Invalid credentials. Access denied.", 20);
            return;
        }

        typePrint("✅ ID confirmed. Welcome!", 20);
        sleep(700);

        // ---------- BANK SETUP ----------
        Account account = new Account(45891234, 1000);
        Customer customer = new Customer("Abey Akilesh", account);
        Bank bank = new Bank(customer);

        // ---------- MAIN LOOP ----------
        while (true) {

            String menu = """
            
            -------- MAIN MENU --------
            1. Deposit Amount
            2. Withdraw Cash
            3. Check Balance
            4. View Account Details
            5. Transaction History
            6. Exit
            ---------------------------
            """;

            typePrint(menu, 12);   // typing animation
            System.out.print("Select option: ");

            try {
                int choice = Integer.parseInt(sc.nextLine());

                switch (choice) {
                    case 1 -> {
                        System.out.print("Enter deposit amount: ₹");
                        bank.deposit(Double.parseDouble(sc.nextLine()));
                    }
                    case 2 -> {
                        System.out.print("Enter withdrawal amount: ₹");
                        bank.withdraw(Double.parseDouble(sc.nextLine()));
                    }
                    case 3 -> bank.showBalance();
                    case 4 -> bank.showAccountDetails();
                    case 5 -> bank.printHistory();
                    case 6 -> {
                        typePrint("\nThank you for banking with us. Have a great day!", 15);
                        return;
                    }
                    default -> typePrint("⚠ Invalid option. Please try again.", 15);
                }
            } catch (Exception e) {
                typePrint("❌ Error: " + e.getMessage(), 15);
            }

            sleep(500);
        }
    }
}
