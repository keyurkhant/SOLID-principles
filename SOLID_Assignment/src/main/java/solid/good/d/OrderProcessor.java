package solid.good.d;

public class OrderProcessor {
    private IOrderRepository orderRepository;
    public OrderProcessor(IOrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public void processOrder(Order order) {
        orderRepository.saveOrder(order);
    }

    public void cancelOrder(Order order) {
        orderRepository.removeOrder(order);
    }
}
