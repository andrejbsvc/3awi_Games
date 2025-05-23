package at.andrej.Games_Programmieren.AmazonShop;


public class Main {
    public static void main(String[] args) {
        Amazon amazon = new Amazon();
        Cart cart = new Cart();

        amazon.addProduct(new Shoe(1, "Nike Air TN´s", "Talahon shoe", 179.99, "Black"));
        amazon.addProduct(new MobilePhone(2, "iPhone 15 Pro", "Latest Apple phone", 1599.99));

        GUI gui = new GUI(amazon, cart);
        gui.start();
    }
}
