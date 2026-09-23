class PaymentProcessor {

    void processPayment(double amount) {
        System.out.println("Paid an amount of UGX" + amount);
    }

    void processPayment(double amount, String couponCode) {
        System.out.println("Paid an amount of UGX" + amount);
        System.out.println("Coupon code applied: " + couponCode);
    }
}