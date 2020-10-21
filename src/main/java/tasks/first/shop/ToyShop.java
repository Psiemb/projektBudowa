package tasks.first.shop;

import java.util.ArrayList;
import java.util.List;

public class ToyShop {

    private List<Toy> toys;

    private ToyShop() {
        this.toys = new ArrayList<>();
    }

    public List<Toy> getToys() {
        return toys;
    }

    public static ToyShop createToyShop() {
        ToyShop toyShop = new ToyShop();
        toyShop.toys = createToys();

        return toyShop;
    }

    private static List<Toy> createToys() {
        ArrayList<Toy> toys = new ArrayList<>();
        toys.add(createToy(ToyType.TRANSFORMER, "Optimus Prime", 219.8));
        toys.add(createToy(ToyType.TRANSFORMER, "Jazz", 99));
        toys.add(createToy(ToyType.TRANSFORMER, "Ratcher", 143.99));
        toys.add(createToy(ToyType.TRANSFORMER, "Ironhide", 15));
        toys.add(createToy(ToyType.CUDDLY, "Blin", 15));
        toys.add(createToy(ToyType.CUDDLY, "Sunnie", 56));
        toys.add(createToy(ToyType.CUDDLY, "KitKot", 111));
        toys.add(createToy(ToyType.CUDDLY, "Smiler", 93));
        toys.add(createToy(null, null, -999));

        return toys;
    }

    private static Toy createToy(ToyType type, String name, double price) {
        return new Toy(type, name, price);
    }
}
