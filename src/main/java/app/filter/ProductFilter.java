package app.filter;

import app.model.Product;

import java.util.List;
import java.util.Map;

@FunctionalInterface
public interface ProductFilter<K,V> {
    public Map<K, V> filter(List<Product> products);
}
