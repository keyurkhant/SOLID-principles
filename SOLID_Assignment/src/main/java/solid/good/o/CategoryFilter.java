package solid.good.o;

import java.util.ArrayList;
import java.util.List;

public class CategoryFilter implements ProductFilter{
    private String category;
    CategoryFilter(String category) {
        this.category = category;
    }

    @Override
    public List<Product> filter(List<Product> products) {
        List<Product> filteredProducts = new ArrayList<>();
        for (Product product : products) {
            if (product.getCategory().equals(category)) {
                filteredProducts.add(product);
            }
        }
        return filteredProducts;
    }
}
