public class Main {
    public static void main(String[] args) {

        Item[] items = {
            new Percentdiscountitem("Bread", 3500.00, 3, 5),
            new NoDiscountItem("Cake(slice)", 25000.00),
            new FlatDiscountItem("Doughnut", 1000.00, 6, 500),
            new Percentdiscountitem("Cookie", 500.00, 10, 10)
        };

        int[] quantities = {2, 2, 5, 10};

        System.out.println("===== SweetHome Bakery - Price List =====");

        for (Item item : items) {
            System.out.printf("%-15s UGX %,10.2f%n",
                    item.getName(),
                    item.getPrice());
        }

        System.out.println("==========================================");
        System.out.println();

        System.out.println("========== RECEIPT ==========");

        double grandTotal = 0;

        for (int i = 0; i < items.length; i++) {

            double lineTotal = items[i].calculateTotal(quantities[i]);

            System.out.printf(
                    "%-15s qty: %-3d UGX %,10.2f%n",
                    items[i].getName(),
                    quantities[i],
                    lineTotal
            );

            grandTotal += lineTotal;
        }

        System.out.println("------------------------------");
        System.out.printf("GRAND TOTAL: UGX %,.2f%n", grandTotal);
        System.out.println("==============================");
    }
}
