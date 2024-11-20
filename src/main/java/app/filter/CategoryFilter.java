package app.filter;

import app.model.Product;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CategoryFilter implements ProductFilter<String, List<Product>> {
    @Override
    public Map<String, List<Product>> filter(List<Product> products) {
        return products.stream()
                .collect(Collectors.groupingBy(Product::getCategory));
    }
}
