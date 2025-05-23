package at.andrej.Games_Programmieren.AmazonShop;


class MobilePhone implements Product {
    private String id, title, description;
    private double price;

    public MobilePhone(int id, String title, String description, double price) {
        this.id = String.valueOf(id);
        this.title = title;
        this.description = description;
        this.price = price;
    }

    public String getId() { return id; }
    public String getTitle() { return title; }
    public double getPrice() { return price; }
    public String getDescription() { return description; }

    public void call(String number) {
        System.out.println("The Iphone is Calling " + number + "...");
    }
}
