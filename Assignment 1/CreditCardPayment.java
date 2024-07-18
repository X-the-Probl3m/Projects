//student number: 37302205
//assignment 1

public class CreditCardPayment extends Payment {
    //Variables
    private String cardNumber; //credit/debit card number
    
    //Constructor
    public CreditCardPayment(double amount, String currency, String cardNumber) {
        super(amount, currency);
        this.cardNumber = cardNumber;
    }
    
    //Accessors and Mutators
    public String getCardNumber() {
        return this.cardNumber;
    }
    
    public void setCardNumber() {
        this.cardNumber = cardNumber;
    }
    
    //implementation of processPayment method
    @Override
    public void processPayment() {
        System.out.println("Processing credit/debit card payment of " + getAmount() + " " + getCurrency() + ". Card number: " + cardNumber);
    }
    
    @Override
    public String toString() {
        return super.toString() + ", Card Number: " + cardNumber;
    }
}