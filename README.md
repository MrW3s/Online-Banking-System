# Online Banking System

A local desktop banking application built with JavaFX and core Java OOP principles.
Developed as a final project for an introductory Java course.

---

## Description

The Online Banking System is a desktop application that simulates core banking
functionality. Users can manage checking and savings accounts, view transaction
history, transfer funds, and manage credit and debit cards — all through a
JavaFX graphical interface running entirely on your local machine.

---

## Features

- View checking and savings account balances
- Deposit and withdraw funds
- Transfer funds between accounts
- View transaction history
- Manage credit cards (Secured, Travel, Business)
- Manage debit cards linked to checking accounts

---

## Tech Stack

- Java 17+
- JavaFX 17+
- FXML (screen layouts)
- CSS (JavaFX styling)

---

## OOP Concepts Demonstrated

- Inheritance — CheckingAccount and SavingsAccount extend BankAccount;
  CreditCard and DebitCard extend Card
- Abstraction — BankAccount and Card are abstract base classes
- Encapsulation — private fields with getters and setters throughout
- Polymorphism — card types handled through shared Card interface

---

## Project Structure

OnlineBankingSystem/
├── src/
│   ├── main/java/com/banking/
│   │   ├── Main.java
│   │   ├── model/
│   │   │   ├── User.java
│   │   │   ├── BankAccount.java
│   │   │   ├── CheckingAccount.java
│   │   │   ├── SavingsAccount.java
│   │   │   ├── Card.java
│   │   │   ├── CreditCard.java
│   │   │   └── DebitCard.java
│   │   └── controller/
│   │       ├── DashboardController.java
│   │       ├── AccountController.java
│   │       └── CardController.java
│   └── resources/
│       ├── fxml/
│       │   ├── dashboard.fxml
│       │   ├── accounts.fxml
│       │   └── cards.fxml
│       └── css/
│           └── style.css
└── README.md

---

## Getting Started

### Prerequisites

- Java 17 or higher
- JavaFX 17 or higher
- IntelliJ IDEA (recommended) or any Java IDE

### Installation

1. Clone the repository
   git clone https://github.com/your-username/online-banking-system.git

2. Open the project in IntelliJ IDEA

3. Add the JavaFX SDK to your project libraries
   File > Project Structure > Libraries > + > Java > select your JavaFX lib folder

4. Add VM options to your run configuration
   --module-path /path/to/javafx/lib --add-modules javafx.controls,javafx.fxml

5. Run Main.java

---

## Usage

Launch the app and use the navigation to:
- Check your account balances on the Dashboard
- Deposit, withdraw, or transfer funds under Accounts
- View and manage your cards under Cards

Note: Data is stored in memory only. It will reset each time the app is closed.

---

## Class Overview

| Class             | Type     | Description                                      |
|-------------------|----------|--------------------------------------------------|
| User              | Concrete | Holds user profile and associated accounts/cards |
| BankAccount       | Abstract | Base class for all account types                 |
| CheckingAccount   | Concrete | Supports overdraft limit and transaction history |
| SavingsAccount    | Concrete | Includes interest rate and addInterest() method  |
| Card              | Abstract | Base class for all card types                    |
| CreditCard        | Concrete | Supports Secured, Travel, and Business types     |
| DebitCard         | Concrete | Linked to a CheckingAccount                      |

---

## Author

Your Name
Course Name — Semester Year
Institution Name

---

## License

This project was created for educational purposes.
