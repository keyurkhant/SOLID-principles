package solid.good.o;

import java.util.ArrayList;
import java.util.List;

public class BlacklistFilter implements ProductFilter {

    BlacklistFilter() {
    }

    @Override
    public List<Product> filter(List<Product> products) {
        List<String> blacklistedCategories = getBlacklistedCategories();
        List<String> blacklistedWords = getBlacklistedWords();

        List<Product> filteredProducts = new ArrayList<>();
        for(Product product1: products) {
            if(blacklistedCategories.contains(product1.getCategory().toLowerCase()) ||
                    containsBlacklistedWords(product1.getName().toLowerCase(), blacklistedWords)) {
                filteredProducts.add(product1);
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
