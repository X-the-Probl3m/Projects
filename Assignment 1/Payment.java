//student number: 37302205
//assignment 1

public abstract class Payment {
    //Variables
    private double amount; //amount to be processed 
    private String currency; //currency domination of amount
    
    //Constructor
    public Payment(double amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }
    
    //Accessors and Mutators
    public double getAmount() {
        return this.amount;
    }
    
    public String getCurrency() {
        return this.currency;
    }
    
    public void setAmount() {
        this.amount = amount;
    }
    
    public void setCurrency() {
        this.currency = currency;
    }
    
    //Abstract Method
    abstract void processPayment();
    
    //toString Method
    @Override
    public String toString() {
        return "Amount: " + amount + ", Currency: " + currency;
    }
}