package solid.bad.d;

public class OrderProcessor {
    private DatabaseConnection databaseConnection;
    public OrderProcessor() {
        this.databaseConnection = new DatabaseConnection();
    }

    public void processOrder(Order order) {
        databaseConnection.saveOrder(order);
    }

    public void cancelOrder(Order order) {
        databaseConnection.removeOrder(order);
    }
}

