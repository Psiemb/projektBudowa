package tasks.first.shop;

public class Toy {

    private ToyType type;
    private String name;
    private double price;

    public Toy(ToyType type, String name, double price) {
        this.type = type;
        this.name = name;
        this.price = price;
    }

    public ToyType getType() {
        return type;
    }

    public void setType(ToyType type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Toy{" +
                "type=" + type +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
