package tasks.first.shop;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Toy toy = (Toy) o;
        return Double.compare(toy.price, price) == 0 &&
                type == toy.type &&
                Objects.equals(name, toy.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, name, price);
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
