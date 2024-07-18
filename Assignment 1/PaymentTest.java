//student number: 37302205
//assignment 1
import java.util.*;

public class PaymentTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //prompt user to choose payment method
        System.out.println("Choose payment method:");
        System.out.println("1. Credit/Debit Card Payment");
        System.out.println("2. Bank Wire Transfer");
        int choice = input.nextInt();
        
        Payment payment = null; //variable payment of type Payment
        
        //process payment based on user choice
        switch(choice) {
            case 1:
                System.out.println("You chose the credit/debit card payment");
                
                System.out.println("Enter amount:");
                double cardAmount = input.nextDouble(); //amount to be processed to credit card
                input.nextLine();
                
                System.out.println("Enter currency:");
                String cardCurrency = input.nextLine(); //currency of amount
                
                System.out.println("Enter credit/debit card number:");
                String cardNumber = input.nextLine(); //credit/debit card number
                
                payment = new CreditCardPayment(cardAmount, cardCurrency, cardNumber);
                break;
                
            case 2:
                System.out.println("You chose the Bank Wire Transfer");
                
                System.out.println("Enter amount:");
                double bankAmount = input.nextDouble(); //amount to be processed to bank account
                input.nextLine();
                
                System.out.println("Enter currency:");
                String bankCurrency = input.nextLine(); //currency of amount
                
                System.out.println("Enter recipient name:");
                String recipientName = input.nextLine(); //name of recipient
                
                System.out.println("Enter bank name:");
                String bank = input.nextLine(); //name of bank
                
                System.out.println("Enter bank account number:");
                String accNumber = input.nextLine(); //bank account number
                
                System.out.println("Enter bank swift code");
                int swiftCode = input.nextInt(); //bank swift code
                
                payment = new BankWire(bankAmount, bankCurrency, recipientName, bank, accNumber, swiftCode);
                break;
                
                default:
                    System.out.println("Invalid choice. Please choose a valid payment method.");
                    break;
        }
        
        if (payment != null) {
            //polymorphism
            payment.processPayment();
            
            //implicit toString call
            System.out.println(payment);
            
            //explicit toString call
            System.out.println(payment.toString());
        }
    }
}
