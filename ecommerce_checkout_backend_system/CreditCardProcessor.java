public class CreditCardProcessor extends PaymentProcessor{

  @Override
  public void ProcessPayment(double amount){
    System.out.println("Processing UGX" + amount + " using credit card");
  }
}  
