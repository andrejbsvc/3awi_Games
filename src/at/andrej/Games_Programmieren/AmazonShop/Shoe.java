package at.andrej.Games_Programmieren.AmazonShop;

class Shoe implements Product {
    private String id, title, description, color;
    private double price;

    public Shoe(int id, String title, String description, double price, String color) {
        this.id = String.valueOf(id);
        this.title = title;
        this.description = description;
        this.price = price;
        this.color = color;
    }

    public String getId() { return id; }
    public String getTitle() { return title; }
    public double getPrice() { return price; }
    public String getDescription() { return description + " Color: " + color; }
}
