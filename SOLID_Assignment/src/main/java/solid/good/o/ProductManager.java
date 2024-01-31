package solid.good.o;

import java.util.List;

public class ProductManager {
    private List<Product> products;
    private ProductFilter productFilter;

    public ProductManager(List<Product> products) {
        this.products = products;
    }

    public List<Product> filterByCategory(String category) {
        productFilter = new CategoryFilter(category);
        return productFilter.filter(products);
    }

    public List<Product> filterByPriceRange(double minPrice, double maxPrice) {
        productFilter = new PriceRangeFilter(minPrice, maxPrice);
        return productFilter.filter(products);
    }

    public List<Product> filterByPriceGreater(double price) {
        productFilter = new PriceGreaterFilter(price);
        return productFilter.filter(products);
    }

    public List<Product> filterByName(String name) {
        productFilter = new NameFilter(name);
        return productFilter.filter(products);
    }

    public List<Product> blacklistedProducts() {
        productFilter = new BlacklistFilter();
        return productFilter.filter(products);
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public void updateProductPrice(Product product, double newPrice) {
        product.setPrice(newPrice);
    }

    public void printProductDetails(Product product) {
        System.out.println("Product Name: " + product.getName());
        System.out.println("Category: " + product.getCategory());
        System.out.println("Price: " + product.getPrice());
        System.out.println();
    }
}
