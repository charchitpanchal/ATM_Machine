# ATM Balance Management System

## Overview

This is a simple ATM Balance Management System developed in Java using Object-Oriented Programming (OOP) concepts. The program allows users to:

* Verify their PIN
* Check account balance
* Withdraw money
* Deposit money
* Exit the application

The application is menu-driven and operates through the command line.

---

## Features

### 1. PIN Verification

* User must enter the correct PIN to access ATM services.
* Invalid PINs are rejected.

### 2. Check Balance

* Displays the current account balance.

### 3. Withdraw Money

* Allows users to withdraw money from their account.
* Prevents withdrawal if the balance is insufficient.

### 4. Deposit Money

* Allows users to deposit money into their account.
* Updates the account balance accordingly.

### 5. Exit

* Terminates the application.

---

## Technologies Used

* Java
* Scanner Class (for user input)
* Object-Oriented Programming Concepts

---

## Class Structure

### Class: `ATM_Balance`

#### Attributes

| Variable | Type  | Description            |
| -------- | ----- | ---------------------- |
| balance  | float | Stores account balance |
| PIN      | int   | Stores ATM PIN         |

#### Methods

| Method           | Description                  |
| ---------------- | ---------------------------- |
| checkpin()       | Verifies user PIN            |
| menu()           | Displays ATM menu            |
| check_balance()  | Shows current balance        |
| withdraw_money() | Withdraws money from account |
| deposit_money()  | Deposits money into account  |
| main()           | Program entry point          |

---

## Sample Execution

Enter your PIN
5794

Enter the choice

1. Check A/C Balance
2. Withdraw Money
3. Deposit Money
4. Exit

Choice: 3

Enter the amount to deposit:
5000

Balance after deposit is: 5000.0

Choice: 1

Balance: 5000.0

Choice: 2

Enter the amount to withdraw:
1000

Balance after withdrawal is: 4000.0

---

## OOP Concepts Used

* Class
* Object
* Instance Variables
* Methods
* Encapsulation
* Constructor

---

## How to Run

1. Save the file as `ATM_Balance.java`
2. Open terminal or command prompt.
3. Compile the program:

```bash
javac ATM_Balance.java
```

4. Run the program:

```bash
java ATM_Balance
```

---

## Future Improvements

* Multiple user accounts
* PIN change functionality
* Transaction history
* Data storage using files or database
* Mini statement generation

---

## Author

Developed as a Java OOP Practice Project.
