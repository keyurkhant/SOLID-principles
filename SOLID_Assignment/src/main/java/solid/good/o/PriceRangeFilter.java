package solid.good.o;

import java.util.ArrayList;
import java.util.List;

public class PriceRangeFilter implements ProductFilter {
    double minPrice;
    double maxPrice;

    PriceRangeFilter(double minPrice, double maxPrice) {
        this.minPrice = minPrice;
        this.maxPrice = maxPrice;
    }

    @Override
    public List<Product> filter(List<Product> products) {
        List<Product> filteredProducts = new ArrayList<>();
        for (Product product : products) {
            if (product.getPrice() >= minPrice && product.getPrice() <= maxPrice) {
                filteredProducts.add(product);
            }
        }
        return filteredProducts;
    }
}
