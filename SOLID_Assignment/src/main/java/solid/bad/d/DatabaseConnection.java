package solid.bad.d;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DatabaseConnection {
    Connection connection = null;

    DatabaseConnection() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "username", "password");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void saveOrder(Order order) {
        try {
            String sql = "INSERT INTO orders (order_id, customer_name) VALUES (?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);

            statement.setInt(1, order.getOrderId());
            statement.setString(2, order.getCustomerName());
            statement.executeUpdate();
            statement.close();

            for (Item item : order.getItems()) {
                String itemSql = "INSERT INTO order_items (order_id, item_name, price) VALUES (?, ?, ?)";
                PreparedStatement itemStatement = connection.prepareStatement(itemSql);

                itemStatement.setInt(1, order.getOrderId());
                itemStatement.setString(2, item.getName());
                itemStatement.setDouble(3, item.getPrice());

                itemStatement.executeUpdate();

                itemStatement.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void removeOrder(Order order) {
        try {
            String sql = "DELETE FROM orders WHERE order_id = ?";
            PreparedStatement statement = connection.prepareStatement(sql);

            statement.setInt(1, order.getOrderId());

            statement.executeUpdate();

            statement.close();

            String itemSql = "DELETE FROM order_items WHERE order_id = ?";
            PreparedStatement itemStatement = connection.prepareStatement(itemSql);

            itemStatement.setInt(1, order.getOrderId());

            itemStatement.executeUpdate();

            itemStatement.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

