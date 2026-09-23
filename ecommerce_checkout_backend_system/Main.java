public class Main {

    public static void main(String[] args) {

        PaymentProcessor payment1 = new CreditCardProcessor();
        PaymentProcessor payment2 = new PayPalProcessor();

        System.out.println("Credit Card Payment:");
        payment1.processPayment(50000);

        System.out.println();

        System.out.println("PayPal Payment:");
        payment2.processPayment(75000);

        System.out.println();

        System.out.println("Credit Card Payment with Coupon:");
        payment1.processPayment(50000, "SAVE10");

        System.out.println();

        System.out.println("PayPal Payment with Coupon:");
        payment2.processPayment(75000, "WELCOME20");
    }
}
