package tasks.first.shop;

import java.util.ArrayList;
import java.util.List;

public class ToyShop {

    private List<Toy> toys;
    private Toy zabawka;

    private ToyShop() {
        this.toys = new ArrayList<>();   // mówimy że zmienna toys przejmuje referncje z listy Array kolejnych obiektów
        this.zabawka = new Toy(ToyType.TRANSFORMER, "Optimus Prime", 219.8);
    }

    public List<Toy> getToys() {     //metodoa zwraca w zmiennej toys liste kolejnych zabawek
        return toys;
    }

    public Toy getZabawka() {
        return zabawka;
    }

    public static ToyShop createToyShop() {    // w tej metodzie do tworzonego sklepu przypisujemy utworzone zabawki - prawda??
        ToyShop toyShop = new ToyShop();       //utworzenie sklepu
        toyShop.toys = createToys();           //przypisanie kolejnych zabwek do sklepu

        return toyShop;            //zwraca sklep wraz zabawkami
    }

    private static List<Toy> createToys() {
        List<Toy> toys = new ArrayList<>();
        toys.add(createToy(ToyType.TRANSFORMER, "Optimus Prime", 219.8));
        toys.add(createToy(ToyType.TRANSFORMER, "Jazz", 99));
        toys.add(createToy(ToyType.TRANSFORMER, "Ratcher", 143.99));
        toys.add(createToy(ToyType.TRANSFORMER, "Ironhide", 15));
        toys.add(createToy(ToyType.TRANSFORMER, "Ironhideee", 15));
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
