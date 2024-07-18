//student number: 37302205
//assignment 1

public class BankWire extends Payment {
    //variables
    private String recipientName, bank, accNumber; //recipient name, bank name, account number of recipient
    private int swiftCode; //bank swift code
    
    //constructor
    public BankWire(double amount, String currency, String recipientName, String bank, String accNumber, int swiftCode) {
        super(amount, currency);
        this.recipientName = recipientName;
        this.bank = bank;
        this.accNumber = accNumber;
        this.swiftCode = swiftCode;
    }
    
    //accessors and mutators
    public String getRecipientName() {
        return this.recipientName;
    }
    
    public void setRecipientName() {
        this.recipientName = recipientName;
    }
    
    public String getBank() {
        return this.bank;
    }
    
    public void setBank() {
        this.bank = bank;
    }
    
    public String getAccNumber() {
        return this.accNumber;
    }
    
    public void setAccNumber() {
        this.accNumber = accNumber;
    }
    
    public int getSwiftCode() {
        return this.swiftCode;
    }
    
    public void setSwiftCode() {
        this.swiftCode = swiftCode; 
    }
    
    //implementation of processPayment method
    @Override
    public void processPayment() {
        System.out.println("Processing bank wire transfer of " + getAmount() + " " + getCurrency() + " to " + recipientName + ". Account number: " + accNumber);
    }
    
    //toString method
    @Override
    public String toString() {
        return super.toString() + ", Recipient Name: " + recipientName + ", Account Number: " + accNumber;
    }
}