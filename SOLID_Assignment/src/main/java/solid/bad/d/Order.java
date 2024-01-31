package solid.bad.d;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private int orderId;
    private String customerName;
    private List<Item> items;

    public Order(int orderId, String customerName, List<Item> items) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.items = items;
    }

    public int getOrderId() {
        return orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public List<Item> getItems() {
        return items;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public double calculateTotalPrice() {
        double totalPrice = 0;
        for (Item item : items) {
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order ID: ").append(orderId).append("\n");
        sb.append("Customer Name: ").append(customerName).append("\n");
        sb.append("Items:\n");
        for (Item item : items) {
            sb.append("- ").append(item.getName()).append(": ").append(item.getPrice()).append("\n");
        }
        sb.append("Total Price: ").append(calculateTotalPrice());
        return sb.toString();
    }
}

