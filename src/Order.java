import java.util.ArrayList;
import java.util.List;

public class Order {
    private String orderID;
    private double amount;
    private boolean delivered;

    public Order(String orderID, double amount, boolean delivered) {
        this.orderID = orderID;
        this.amount = amount;
        this.delivered = delivered;
    }

    public String getOrderID() {
        return orderID;
    }

    public double getAmount() {
        return amount;
    }

    public boolean isDelivered() {
        return delivered;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderID + '\'' +
                ", amount=" + amount +
                ", delivered=" + delivered +
                '}';
    }
}
