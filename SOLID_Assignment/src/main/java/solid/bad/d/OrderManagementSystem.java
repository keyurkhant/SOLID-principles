package solid.bad.d;

import java.util.ArrayList;
import java.util.List;

public class OrderManagementSystem {
    public static void main(String[] args) {
        Item item1 = new Item("1", "Panipuri", 33.2);
        Item item2 = new Item("2", "Pizza", 40.3);

        List<Item> itemList = new ArrayList<>();
        itemList.add(item1);
        itemList.add(item2);

        Order order = new Order(1, "Keyur", itemList);

        System.out.println(order.calculateTotalPrice());
        System.out.println(order.toString());

        try {
            OrderProcessor orderProcessor = new OrderProcessor();
            orderProcessor.processOrder(order);
            orderProcessor.cancelOrder(order);
        } catch (Exception e) {
            System.out.println("Exception occurred due Database connection");
        }
    }
}
