package solid.bad.o;

import java.util.ArrayList;
import java.util.List;

public class ProductFilter {
    public List<Product> filterByCategory(List<Product> products, String category) {
        List<Product> filteredProducts = new ArrayList<>();
        for (Product product : products) {
            if (product.getCategory().equals(category)) {
                filteredProducts.add(product);
            }
        }
        return filteredProducts;
    }

    public List<Product> filterByName(List<Product> products, String name) {
        List<Product> filteredProducts = new ArrayList<>();
        for (Product product : products) {
            if (product.getName().contains(name.toLowerCase())) {
                filteredProducts.add(product);
            }
        }
        return filteredProducts;
    }

    public List<Product> filterByPriceRange(List<Product> products, double minPrice, double maxPrice) {
        List<Product> filteredProducts = new ArrayList<>();
        for (Product product : products) {
            if (product.getPrice() >= minPrice && product.getPrice() <= maxPrice) {
                filteredProducts.add(product);
            }
        }
        return filteredProducts;
    }

    public boolean isProductBlacklisted(Product product) {
        List<String> blacklistedCategories = getBlacklistedCategories();
        List<String> blacklistedWords = getBlacklistedWords();

        return blacklistedCategories.contains(product.getCategory().toLowerCase()) ||
                containsBlacklistedWords(product.getName().toLowerCase(), blacklistedWords);
    }

    public List<Product> filterByPriceGreater(List<Product> products, double price) {
        List<Product> filteredProducts = new ArrayList<>();
        for (Product product : products) {
            if (product.getPrice() >= price) {
                filteredProducts.add(product);
            }
        }
        return filteredProducts;
    }

    private List<String> getBlacklistedCategories() {
        return List.of("discontinued", "out of stock");
    }

    private List<String> getBlacklistedWords() {
        return List.of("fake", "counterfeit", "scam");
    }

    private boolean containsBlacklistedWords(String text, List<String> blacklistedWords) {
        for (String word : blacklistedWords) {
            if (text.contains(word)) {
                return true;
            }
        }
        return false;
    }
}
