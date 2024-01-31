package solid.good.o;

import java.util.List;
import java.util.function.Predicate;

public interface ProductFilter {
    List<Product> filter(List<Product> products);
}
