public class PayPalProcessor extends PaymentProcessor {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing UGX" + amount + " using PayPal");
    }

    @Override
    public void processPayment(double amount, String couponCode) {
        System.out.println("Processing UGX" + amount + " using PayPal");
        System.out.println("Coupon code applied: " + couponCode);
    }
}
