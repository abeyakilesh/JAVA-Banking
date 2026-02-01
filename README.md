# JAVA-Banking 🏦

<img width="100%" alt="Java Banking System Interface" src="https://github.com/user-attachments/assets/56b13c92-9632-410b-814f-264a9b2e2feb" />

> **A Console-Based Banking System built with Core Java.**

---

## Overview
**JAVA-Banking** is a robust, menu-driven console application that simulates real-world banking workflows. Developed using **pure Core Java**, it avoids external frameworks to focus on strong object-oriented design and fundamental programming concepts.

The project features a **secure login system**, **transaction management**, and a unique **typing-effect CLI** with multithreaded animations to provide a realistic terminal experience.

---

## Key Features

* **Secure Login:** Authentication system (ID & Password verification).
* **Core Banking Operations:** Deposit and Withdraw functionality with validation.
* **Live Balance Enquiry:** Instant balance updates.
* **Transaction History:** Tracks all actions with real-time timestamps.
* **Interactive CLI:** "Typing effect" text for a retro-terminal feel.
* **Multithreaded Animations:** Loading bars and processing delays using `Thread.sleep()`.
* **Thread Safety:** Uses `synchronized` methods to prevent race conditions.
* **Error Handling:** Robust `try-catch` blocks to manage invalid inputs.

---

## Java Concepts Demonstrated

This project serves as a practical implementation of the following concepts:
* **OOP Principles:** Encapsulation, Classes, and Objects.
* **Multithreading:** Implementing `Thread` for UI simulations.
* **Synchronization:** Ensuring thread safety in account operations.
* **Exception Handling:** Managing `NumberFormatException` and I/O errors.
* **Collections Framework:** Using `ArrayList` to store transaction history.
* **Java I/O:** Console input handling using `Scanner`.

---

## Project Structure

The project is modularized into distinct classes for better maintainability:

```text
JAVA-Banking/
│
├── src/
│   ├── Main.java              // Entry point, Login Logic, & Menu Loop
│   ├── BankAccount.java       // Core business logic (Deposit, Withdraw, Sync)
│   ├── Transaction.java       // Data model for transaction records
│   └── ConsoleUtils.java      // Helper class for Typing Effects & Animations
│
└── README.md
```
---

## How to Run
1. Clone the repository
2. Open the project in **IntelliJ IDEA**
3. Run `Main.java`

---

## Demo Credentials
- Customer ID: abey-hdfc-1234
- Password: Abey1234


---

## Why This Project Matters
This project demonstrates:
- Strong **Core Java fundamentals**
- Ability to design **end-to-end workflows and Error handling**
- Understanding of **concurrency ,synchronization and Multithreading**
- Clean, readable, beginner-written but professional code

It is intentionally built **without frameworks** to showcase foundational Java skills clearly. 

---

## Future Enhancements
- ATM-style PIN retry & account lock
- OTP-based authentication (simulation)
- Daily withdrawal limits
- Persistent storage (file / database)

---

## Author

Abey Akilesh
Engineering Student | Java & Full Stack Enthusiast
