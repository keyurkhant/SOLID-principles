package solid.good.o;

import java.util.ArrayList;
import java.util.List;

public class PriceGreaterFilter implements ProductFilter {
    double price;

    PriceGreaterFilter(double price) {
        this.price = price;
    }

    @Override
    public List<Product> filter(List<Product> products) {
        List<Product> filteredProducts = new ArrayList<>();
        for (Product product : products) {
            if (product.getPrice() >= price) {
                filteredProducts.add(product);
            }
        }
        return filteredProducts;
    }
}
