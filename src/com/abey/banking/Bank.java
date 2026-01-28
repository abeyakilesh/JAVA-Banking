package com.abey.banking;

public class Bank {

    private final Customer customer;

    public Bank(Customer customer) {
        this.customer = customer;
    }

    public void deposit(double amount) {
        runAnimation();
        customer.getAccount().deposit(amount);
        System.out.println("✅ Amount ₹" + amount + " credited successfully.");
        sleep1s();
        System.out.println("📩 SMS sent to registered mobile number.");
    }

    public void withdraw(double amount) {
        runAnimation();
        customer.getAccount().withdraw(amount);
        System.out.println("✅ Please collect your cash: ₹" + amount);
        sleep1s();
        System.out.println("🧾 Transaction receipt generated.");
    }

    public void showBalance() {
        sleep1s();
        System.out.println("💰 Available Balance: ₹" + customer.getAccount().getBalance());
    }

    public void showAccountDetails() {
        sleep1s();
        System.out.println("\n--- ACCOUNT DETAILS ---");
        System.out.println("Customer Name : " + customer.getName());
        System.out.println("Account No    : " + customer.getAccount().getAccountNumber());
        System.out.println("Bank          : HDFC / SBI (Simulation)");
        System.out.println("------------------------");
    }

    public void printHistory() {
        sleep1s();
        System.out.println("\n--- TRANSACTION STATEMENT ---");
        customer.getAccount().getHistory().forEach(System.out::println);
        System.out.println("-----------------------------");
    }

    private void runAnimation() {
        Thread t = new Thread(new ProcessingAnimation());
        t.start();
        try {
            t.join();
        } catch (InterruptedException ignored) {}
    }

    private void sleep1s() {
        try {
            Thread.sleep(350);
        } catch (InterruptedException ignored) {}
    }
}
