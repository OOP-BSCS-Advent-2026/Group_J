public class CreditCardProcessor extends PaymentProcessor{

  @Override
  public void processPayment(double amount){
    System.out.println("Processing UGX" + amount + " using credit card");
  }
}  
