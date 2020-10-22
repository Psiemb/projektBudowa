package tasks.first;

import tasks.first.shop.Toy;
import tasks.first.shop.ToyShop;
import tasks.first.shop.ToyType;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class MainShop {

    public static void main(String[] args) {

        ToyShop toyShop = ToyShop.createToyShop();

        List<Toy> zabawki = toyShop.getToys();

        System.out.println("Wszytkich zabawek w sklepie jest: " + zabawki.size());

        long countTransformer = zabawki.stream()
                .filter(toy -> Objects.nonNull(toy.getType()))
                .filter(toy -> ToyType.TRANSFORMER.equals(toy.getType()))
                .count();

        System.out.println("Wszytskich Transformersów jest: " + countTransformer);

        long countCyddly = zabawki.stream()
                .filter(toy -> Objects.nonNull(toy.getType()))
                .filter(toy -> ToyType.CUDDLY.equals(toy.getType()))
                .count();
        System.out.println("Wszystkich przytulanek jest: " + (countCyddly + countTransformer));

        Double wartoscWszystkichZabawek = zabawki.stream()
                .filter(toy -> Objects.nonNull(toy.getPrice()))
                .filter(toy -> toy.getPrice() > 0)
                .map(Toy::getPrice)
                .reduce(0.0, Double::sum);
        System.out.println("Suma cen wszystkich zabawek wynosi: " + wartoscWszystkichZabawek);


        Double wartoscTransformersow = zabawki.stream()
                .filter(toy -> Objects.nonNull(toy.getPrice()))
                .filter(toy -> ToyType.TRANSFORMER.equals(toy.getType()))
                .map(Toy::getPrice)
                .reduce(0.0, Double::sum);
        System.out.println("Suma cen Transformersów wynosi: " + wartoscTransformersow);


        Double wartoscZabawekCuddly = zabawki.stream()
                .filter(toy -> Objects.nonNull(toy.getPrice()))
                .filter(toy -> ToyType.CUDDLY.equals(toy.getType()))
                .map(Toy::getPrice)
                .reduce(0.0, Double::sum);
        System.out.println("Suma cen Zabawek Cuddle wynosi: " + wartoscZabawekCuddly);

        Optional<Double> maxCena = zabawki.stream()
                .filter(toy -> Objects.nonNull(toy.getPrice()))
                .filter(toy -> toy.getPrice() > 0)
                .map(Toy::getPrice)
                .max(Double::compareTo);
        System.out.println("NAdroższa zabawka: " + maxCena);

        Optional<Double> maxCenaTransformersa = zabawki.stream()
                .filter(toy -> Objects.nonNull(toy.getPrice()))
                .filter(toy -> ToyType.TRANSFORMER.equals(toy.getType()))
                .map(Toy::getPrice)
                .max(Double::compareTo);
        System.out.println("Najdroższy Trabsformers: " + maxCenaTransformersa);

        Optional<Double> maxCenaPrzytulanka = zabawki.stream()
                .filter(toy -> Objects.nonNull(toy.getPrice()))
                .filter(toy -> ToyType.CUDDLY.equals(toy.getType()))
                .map(Toy::getPrice)
                .max(Double::compareTo);
        System.out.println("Najdroższa Przytulanka: " + maxCenaPrzytulanka);

        Optional<Double> minCena = zabawki.stream()
                .filter(toy -> Objects.nonNull(toy.getPrice()))
                .filter(toy -> toy.getPrice() > 0)
                .map(Toy::getPrice)
                .min(Double::compareTo);
        System.out.println("Najtańsza zabawka: " + minCena);

        Optional<Double> minCenaTransformersa = zabawki.stream()
                .filter(toy -> Objects.nonNull(toy.getPrice()))
                .filter(toy -> ToyType.TRANSFORMER.equals(toy.getType()))
                .map(Toy::getPrice)
                .min(Double::compareTo);
        System.out.println("Najtańsza Trabsformers: " + minCenaTransformersa);

        Optional<Double> minCenaPrzytulanka = zabawki.stream()
                .filter(toy -> Objects.nonNull(toy.getPrice()))
                .filter(toy -> ToyType.CUDDLY.equals(toy.getType()))
                .map(Toy::getPrice)
                .min(Double::compareTo);
        System.out.println("Najtańsza Przytulanka: " + minCenaPrzytulanka);


        //TODO: Twoim zadaniem jest stworzenie w pakiecie 'staff' pracownika, który będzie miał metody z parametrem List<Toy> i będą one umiały:
        //TODO: metoda pierwsza: policzyc ilość wszystkich zabawek w sklepie
        //TODO: metoda druga: policzyc ilość wszystkich transofmersow
        //TODO: metoda trzecia: policzyc ilość wszystkich przytulanek

        //TODO: metoda kolejna: policzyc cene wszystkich zabawek
        //TODO: metoda kolejna: policzyc cene wszystkich transofmersow
        //TODO: metoda kolejna: policzyc cene wszystkich przytulanek

        //TODO: metoda kolejna: podać najdroższą zabawkę
        //TODO: metoda kolejna: podać najdroższego transformersa
        //TODO: metoda kolejna: podać najdroższego przytulanke

        //TODO: metoda kolejna: podać najtańszą zabawkę
        //TODO: metoda kolejna: podać najtańszego transformersa
        //TODO: metoda kolejna: podać najtańszą przytulanke

        // w razie pytań - pytaj :)

    }

}
