package tasks.first;

import tasks.first.shop.Toy;
import tasks.first.shop.ToyShop;
import tasks.first.shop.ToyType;
import tasks.first.staff.Worker;

import java.util.List;

public class MainShop {

    public static void main(String[] args) {

        ToyShop toyShop = ToyShop.createToyShop();

        List<Toy> zabawki = toyShop.getToys();

        Worker worker = new Worker();


        System.out.println("Wszytkich zabawek w sklepie jest: " + worker.iloscZabawek(zabawki));

        System.out.println("Wszytskich Transformersów jest: " + worker.countTransformer(zabawki));

        System.out.println("Wszystkich przytulanek jest: " + worker.countAll(zabawki) + "\n");

        System.out.println("Suma cen wszystkich zabawek wynosi: " + worker.wartoscWszystkichZabawek(zabawki));

        System.out.println("Suma cen Transformersów wynosi: " + worker.wartoscTransformersow(zabawki));

        System.out.println("Suma cen Zabawek Cuddle wynosi: " + worker.wartoscZabawekCuddly(zabawki) + "\n");


        System.out.println("Suma cen wszystkich zabawek wynosi -rev2 :" + worker.wartoscZabawek(zabawki, ToyType.CUDDLY) + "\n");



        System.out.println("Najdroższa zabawka: " + worker.maxCena(zabawki));

        System.out.println("Najdroższy Trabsformers: " + worker.maxCenaTransformersa(zabawki));

        System.out.println("Najdroższa Przytulanka: " + worker.maxCenaPrzytulanka(zabawki) + "\n");

        System.out.println("Najtańsza zabawka: " + worker.minCena(zabawki));

        System.out.println("Najtańsza Trabsformers: " + worker.minCenaTransformersa(zabawki));

        System.out.println("Najtańsza Przytulanka: " + worker.minCenaPrzytulanka(zabawki));

    }

}
