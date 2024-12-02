import java.util.ArrayList;
import java.util.List;

public class OrderStream {
    public static void main(String[] args) {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order("ID001", 120.50, true));
        orders.add(new Order("ID002", 250.00, false));
        orders.add(new Order("ID003", 80.00, true));
        orders.add(new Order("ID004", 300.00, false));
        orders.add(new Order("ID005", 150.00, true));

        List<Order> highValueOrders = orders.stream()
                .dropWhile(order -> order.getAmount() < 150.0)
                .toList();
        System.out.println("dropWhile Sonucu: " + highValueOrders);

        List<Order> skippedOrders = orders.stream()
                .skip(3)
                .toList();
        System.out.println("skip Sonucu: " + skippedOrders);
    }
}
