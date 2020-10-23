package tasks.first;

import tasks.first.shop.Toy;
import tasks.first.shop.ToyShop;
import tasks.first.shop.ToyType;
import tasks.first.staff.Worker;

import java.util.List;

public class MainShop {

    public static void main(String[] args) {

        ToyShop toyShop = ToyShop.createToyShop();

        List<Toy> toys = toyShop.getToys();

        Worker worker = new Worker();


        System.out.println("Wszytkich zabawek w sklepie jest: " + worker.quantityOfToys(toys));

        System.out.println("Wszytskich Transformersów jest: " + worker.countTransformer(toys));

        System.out.println("Wszystkich przytulanek jest: " + worker.countAll(toys) + "\n");

        System.out.println("Suma cen wszystkich zabawek wynosi: " + worker.valueAllToys(toys));

        System.out.println("Suma cen Transformersów wynosi: " + worker.valueAllToysAsChoiced(toys, ToyType.TRANSFORMER));

        System.out.println("Suma cen Zabawek Cuddle wynosi :" + worker.valueAllToysAsChoiced(toys, ToyType.CUDDLY) + "\n");
     


        System.out.println("Najdroższa zabawka: " + worker.maxPrice(toys));

        System.out.println("Najdroższy Trabsformers: " + worker.maxPriceTransformers(toys));

        System.out.println("Najdroższa Przytulanka: " + worker.maxPriceCuddly(toys) + "\n");

        System.out.println("Najtańsza zabawka: " + worker.minPrice(toys));

        System.out.println("Najtańsza Trabsformers: " + worker.minPriceTransformers(toys));

        System.out.println("Najtańsza Przytulanka: " + worker.minPriceCuddly(toys));

    }

}
