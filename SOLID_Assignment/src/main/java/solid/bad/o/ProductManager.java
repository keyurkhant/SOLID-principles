package solid.bad.o;

import java.util.List;

public class ProductManager {
    private List<Product> products;
    private ProductFilter productFilter;

    public ProductManager(List<Product> products) {
        this.products = products;
        this.productFilter = new ProductFilter();
    }

    public List<Product> filterByCategory(String category) {
        return productFilter.filterByCategory(products, category);
    }

    public List<Product> filterByPriceRange(double minPrice, double maxPrice) {
        return productFilter.filterByPriceRange(products, minPrice, maxPrice);
    }

    public List<Product> filterByPriceGreater(double price) {
        return productFilter.filterByPriceGreater(products, price);
    }

    public List<Product> filterByName(String name) {
        return productFilter.filterByName(products, name);
    }

    public boolean isProductBlacklisted(Product product) {
        return productFilter.isProductBlacklisted(product);
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
