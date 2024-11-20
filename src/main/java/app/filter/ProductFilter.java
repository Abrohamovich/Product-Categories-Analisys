package app.filter;

import app.model.Product;

import java.util.List;
import java.util.Map;

public interface ProductFilter {
    public <K,V> Map<String, Double> filter(List<Product> products);
}
