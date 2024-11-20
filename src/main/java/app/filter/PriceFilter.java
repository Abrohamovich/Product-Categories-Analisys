package app.filter;

import app.model.Product;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Return average price in each category
public class PriceFilter implements ProductFilter<String, Double> {
    @Override
    public Map<String, Double> filter(List<Product> products) {
        return products.stream()
                .collect(Collectors.groupingBy(Product::getCategory, Collectors.averagingDouble(Product::getPrice)));
    }
}