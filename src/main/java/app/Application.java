package app;

import app.model.Product;

import java.util.Arrays;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("Laptop", "Electronics", 1200.0),
                new Product("Coffee Maker", "Appliances", 80.0),
                new Product("Sofa", "Furniture", 800.0),
                new Product("Headphones", "Electronics", 150.0),
                new Product("Blender", "Appliances", 50.0),
                new Product("Smartphone", "Electronics", 999.0),
                new Product("Bookshelf", "Furniture", 150.0),
                new Product("Microwave", "Appliances", 120.0),
                new Product("Desk Lamp", "Furniture", 45.0),
                new Product("Electric Kettle", "Appliances", 60.0),
                new Product("Gaming Chair", "Furniture", 250.0),
                new Product("Smartwatch", "Electronics", 300.0)
        );
    }
}
