package at.andrej.Games_Programmieren.AmazonShop;

import java.util.ArrayList;
import java.util.List;

class Cart {
    private List<Product> items = new ArrayList<>();

    public void addProduct(Product p) {
        items.add(p);
    }
    public void showCart() {
        System.out.println("Cart Contents:");
        for (Product p : items) {
            System.out.println(p.getTitle() + " - " + p.getPrice() + "€");
        }
    }
}