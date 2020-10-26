package tasks.first.shop;

import java.util.ArrayList;
import java.util.List;

public class ToyShop {

    private List<Toy> toysToSold;
    private List<Toy> soldToys;
    private double utarg;

    private ToyShop() {
    }

    public List<Toy> getToysToSold() {     //metodoa zwraca w zmiennej toys liste kolejnych zabawek
        return toysToSold;
    }

    public List<Toy> getSoldToys() {
        return soldToys;
    }

    public double getUtarg() {
        return utarg;
    }

    public static ToyShop createToyShop() {    // w tej metodzie do tworzonego sklepu przypisujemy utworzone zabawki - prawda??
        ToyShop toyShop = new ToyShop();       //utworzenie sklepu
        toyShop.toysToSold = createToys();           //przypisanie kolejnych zabwek do sklepu
        toyShop.soldToys = new ArrayList<>();

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

    public void soldToy(Toy zabawka) {
        //TODO: Objects.nonNull(zabawka)
        if (zabawka == null) {
            System.out.println("Błędna wartość. ");
            return;
        }
        //TODO: ten if raczej jest niepotrzebny
        if (toysToSold.contains(null))
            System.out.println("Element na liście toyToSold ma wartość null.");

        //TODO: gdy zakup został sfinalizowany to dodaj cenę zabawki do aktualnego 'utargu' <- nowe pole
        if (toysToSold.contains(zabawka)) {
            System.out.println("Dokonujemy zakupu. ");
            toysToSold.remove(zabawka);
            soldToys.add(zabawka);
        } else {
            System.out.println("Brak takiej zabawki. ");
            return;
        }
    }
}
