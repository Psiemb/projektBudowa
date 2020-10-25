package tasks.first;

import tasks.first.shop.Toy;
import tasks.first.shop.ToyShop;
import tasks.first.shop.ToyType;
import tasks.first.staff.Worker;

import java.util.List;

public class MainShop {

    public static void main(String[] args) {

        ToyShop toyShop = ToyShop.createToyShop();

        List<Toy> toysToSold = toyShop.getToysToSold();
        List<Toy> soldToys = toyShop.getSoldToys();

        Worker worker = new Worker();

        Toy mostExpensiveToy = worker.getMoreExpensiveToy(toysToSold, ToyType.TRANSFORMER);

        toyShop.soldToy(mostExpensiveToy);
//        toysToSold.remove(mostExpensiveToy);
//
//        soldToys.add(mostExpensiveToy);

        System.out.println("Toys to sold: " + toysToSold);
        System.out.println("Sold toys : " + soldToys);





//        System.out.println("Wszytkich zabawek w sklepie jest: " + worker.quantityOfToys(toysToSold));
//        System.out.println("Wszytskich Transformersów jest: " + worker.countTransformer(toysToSold));
//        System.out.println("Wszystkich przytulanek jest: " + worker.countAll(toysToSold) + "\n");
//        System.out.println("Suma cen wszystkich zabawek wynosi: " + worker.valueAllToys(toysToSold));
//        System.out.println("Suma cen Transformersów wynosi: " + worker.valueAllToysAsChoiced(toysToSold, ToyType.TRANSFORMER));
//        System.out.println("Suma cen Zabawek Cuddle wynosi :" + worker.valueAllToysAsChoiced(toysToSold, ToyType.CUDDLY) + "\n");
//        System.out.println("Najdroższa zabawka: " + worker.maxPrice(toysToSold));
//        System.out.println("Najdroższy Trabsformers: " + worker.maxPriceTransformers(toysToSold));
//        System.out.println("Najdroższa Przytulanka: " + worker.maxPriceCuddly(toysToSold) + "\n");
//        System.out.println("Najtańsza zabawka: " + worker.minPrice(toysToSold));
//        System.out.println("Najtańsza Trabsformers: " + worker.minPriceTransformers(toysToSold));
//        System.out.println("Najtańsza Przytulanka: " + worker.minPriceCuddly(toysToSold));
//
    }

}
