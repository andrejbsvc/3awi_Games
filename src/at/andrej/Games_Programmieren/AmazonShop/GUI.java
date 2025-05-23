package at.andrej.Games_Programmieren.AmazonShop;

import java.util.Scanner;

class GUI {
    private Amazon pm;
    private Cart cart;
    private Scanner scanner;

    public GUI(Amazon pm, Cart cart) {
        this.pm = pm;
        this.cart = cart;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            System.out.println("a) Show all Products");
            System.out.println("b) Sum of Products in Stock");
            System.out.println("c) Add to Cart (via ID)");
            System.out.println("d) Show Cart");
            System.out.println("e) Exit");
            System.out.print("> ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "a": pm.showAllProducts(); break;
                case "b": System.out.println("Total Stock Value: " + pm.totalStockValue() + "€"); break;
                case "c":
                    System.out.print("Enter product ID: ");
                    String id = scanner.nextLine();
                    Product p = pm.getById(id);
                    if (p != null) {
                        cart.addProduct(p);
                        System.out.println("Added " + p.getTitle() + " to cart.");
                    } else {
                        System.out.println("Product not found.");
                    }
                    break;
                case "d": cart.showCart(); break;
                case "e": return;
                default: System.out.println("Invalid choice.");
            }
        }
    }
}
