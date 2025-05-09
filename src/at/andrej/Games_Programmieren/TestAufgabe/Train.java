package at.andrej.Games_Programmieren.TestAufgabe;

public class Train implements Vehicle {
    private String name;
    private int id;

    public Train(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getID() {
        return id;
    }

    @Override
    public void drive() {
        System.out.println(name + " (ID: " + id + ") is moving on tracks.");
    }
}