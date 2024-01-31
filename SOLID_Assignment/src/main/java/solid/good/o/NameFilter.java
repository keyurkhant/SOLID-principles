package solid.good.o;

import java.util.ArrayList;
import java.util.List;

public class NameFilter implements ProductFilter {
    private String name;
    NameFilter(String name) {
        this.name = name;
    }

    @Override
    public List<Product> filter(List<Product> products) {
        List<Product> filteredProducts = new ArrayList<>();
        for (Product product : products) {
            if (product.getName().contains(name.toLowerCase())) {
                filteredProducts.add(product);
            }
        }
        return filteredProducts;
    }
}
