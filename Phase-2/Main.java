public class Main {
    public static void main(String[] args) {
        
        Item[] items = {
            new PercentDiscountItem("Bread", 3500.00, 3, 5),
            new NoDiscountItem("Cake(slice)", 25000.00),
            new FlatDiscountItem("Doughnut", 1000.00, 6, 500),
            new PercentDiscountItem("Cookie", 500.00, 10, 10)
        };

        int[] quantities = {2, 2, 5, 10};

        double grandTotal = 0;
        System.out.println("========== RECEIPT ==========");
        for (int i = 0; i < items.length; i++) {
            double lineTotal = items[i].calculateTotal(quantities[i]);
            System.out.println(items[i].getName() + " x" + quantities[i] + " = UGX " + lineTotal);
            grandTotal += lineTotal;
        }
        System.out.println("------------------------------");
        System.out.println("GRAND TOTAL = UGX " + grandTotal);
        System.out.println("==============================");
    }
}
