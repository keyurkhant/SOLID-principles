package solid.good.d;
public interface IOrderRepository {
    public void saveOrder(Order order);
    public void removeOrder(Order order);
}
