------------------------------------------------------------------------
Payment System Example

This project demonstrates the use of inheritance, polymorphism, and abstract classes in Java. The example simulates a payment system with two types of payments: Credit Card Payment and Bank Wire Transfer. Users can choose the payment method they want to process and provide necessary details for the payment.

## Class Structure

### Super Class: Payment
- **Variables:** `amount`, `currency`
- **Constructor:** Initializes `amount` and `currency`
- **Accessors (Getters):** `getAmount()`, `getCurrency()`
- **Mutators (Setters):** `setAmount()`, `setCurrency()`
- **Abstract Method:** `processPayment()`
- **toString Method:** Returns a string representation of the payment

### Sub Classes: CreditCardPayment, BankWire
- **Variables:**
  - `CreditCardPayment`: `cardNumber`
  - `BankWireTransfer`: `accNumber`
- **Constructor:** Initializes variables specific to each subclass along with the inherited variables
- **Accessors and Mutators:** Specific to each subclass (if needed)
- **Implementation of processPayment():** Each subclass provides its own implementation of `processPayment()`
- **toString Method:** Overrides `toString` method to include additional subclass-specific details (if needed)

------------------------------------------------------------------------

PROJECT TITLE: Payment System
PURPOSE OF PROJECT: This project is a school assignment where we were evaluated if we've aquired the OOP skills, focusing on class design, inheritance and polymorphism.
DATE: 18/07/24
AUTHORS: Sergio Mutisse. NWU student number: 37302205
