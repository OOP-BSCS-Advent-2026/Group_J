// The Inheritance structure
public class FlatDiscountItem extends Item {
    // Encapsulation
    private int threshold;
    private double flatAmount;

    public FlatDiscountItem(String name, double price,
                            int threshold, double flatAmount) {
        super(name, price);
        this.threshold = threshold;
        this.flatAmount = flatAmount;
    }
    
    //Overriding
    @Override
    public double calculateTotal(int quantity) {
        double subtotal = super.calculateTotal(quantity);
        if (quantity >= threshold) {
            subtotal = Math.max(0, subtotal - flatAmount);
        }
        return subtotal;
    }
}
