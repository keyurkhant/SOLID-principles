package solid.bad.o;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toCollection;

public class Main {
    public static void main(String[] args) {
        List<Product> productsImmutable = List.of(
                new Product("1", "Dell 3001", "Laptop",1730.00, 302),
                new Product("2", "Samsung Galaxy S20", "Smartphone", 799.99, 1870),
                new Product("3", "Apple Macbook M1", "Laptop", 2599.11, 209),
                new Product("4", "Logitech G502 Mouse", "Mouse", 79.99, 1200),
                new Product("5", "Logitech G502 Keyboard fake", "Mouse fake", 79.99, 1200)
        );

        List<Product> products = productsImmutable.stream().collect(toCollection(ArrayList::new));

        ProductManager productManager = new ProductManager(products);

        List<Product> filteredByCategory = productManager.filterByCategory("Smartphone");
        System.out.println("Filtered by category:");
        for (Product product : filteredByCategory) {
            productManager.printProductDetails(product);
        }

        List<Product> filteredByPriceRange = productManager.filterByPriceRange(500.0, 1000.0);
        System.out.println("Filtered by price range:");
        for (Product product : filteredByPriceRange) {
            productManager.printProductDetails(product);
        }

        System.out.println("Product " + products.get(4).getName() + " is " + productManager.isProductBlacklisted(products.get(4)));

        Product newProduct = new Product("9", "Dell XPS 13", "Laptop", 1399.99, 233);
        productManager.addProduct(newProduct);
        System.out.println("New product added.");

        Product productToRemove = products.get(1);
        productManager.removeProduct(productToRemove);
        System.out.println("Product removed.");

        Product productToUpdate = products.get(0);
        double newPrice = 1099.99;
        productManager.updateProductPrice(productToUpdate, newPrice);
        System.out.println("Product price updated.");

        Product productToPrint = products.get(2);
        productManager.printProductDetails(productToPrint);
    }
}

