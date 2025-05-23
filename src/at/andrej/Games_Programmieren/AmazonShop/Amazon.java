package at.andrej.Games_Programmieren.AmazonShop;

import java.util.ArrayList;
import java.util.List;

class Amazon {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product p) {
        products.add(p);
    }

    public void showAllProducts() {
        for (Product p : products) {
            System.out.println(p.getId() + ": " + p.getTitle() + " - " + p.getPrice() + "€ (" + p.getDescription() + ")");
        }
    }

    public double totalStockValue() {
        double total = 0;
        for (Product p : products) {
            total += p.getPrice();
        }
        return total;
    }

    public Product getById(String id) {
        return null;
    }
}