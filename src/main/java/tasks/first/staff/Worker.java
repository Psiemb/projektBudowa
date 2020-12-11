package tasks.first.staff;

import tasks.first.shop.Toy;
import tasks.first.shop.ToyType;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class Worker {

    public Toy getMoreExpensiveToy(List<Toy> toysToSold, ToyType toyType) {
        return toysToSold.stream()
                .filter(toy -> Objects.nonNull(toy.getType()))
                .filter(toy -> toyType.equals(toy.getType()))
                //        .max((o1, o2) -> ((int) o1.getPrice()) - (int) o2.getPrice())
                .max(Comparator.comparingInt(o -> ((int) o.getPrice())))
                .orElse(null);
    }

    public Toy getMoreExpensiveToy222(List<Toy> toysToSold, ToyType toyType) {
        Double maxymalnaCena = toysToSold.stream()      // Znajduje najwyzszą cenę
                .filter(toy -> toyType.equals(toy.getType()))
                .map(Toy::getPrice)
                .max((Double::compareTo))
                .orElse(null);

        System.out.println("Najwyższa cena w  wybranym typie zabawki wynosi:" + maxymalnaCena);

        Toy najdrozszaZabawka = toysToSold.stream()  //Zwraca zabawkę o najwyższej cenie
                .filter(toy -> toyType.equals(toy.getType()))
                .filter(toy -> toy.getPrice() == maxymalnaCena)
                .findFirst()
                .orElse(null);

        return najdrozszaZabawka;
    }

    public Long quantityOfToys(List<Toy> toys) {
        long quantityOfToys = toys.size();
        System.out.println(quantityOfToys);
        return quantityOfToys;
    }

    public Long countTransformer(List<Toy> toys) {
        return toys.stream()
                .filter(toy -> Objects.nonNull(toy.getType()))
                .filter(toy -> ToyType.TRANSFORMER.equals(toy.getType()))
                .count();
    }

    public Long countAll(List<Toy> toys) {
        long countCuddly = toys.stream()
                .filter(toy -> Objects.nonNull(toy.getType()))
                .filter(toy -> toy.getPrice() != 0)
                .filter(toy -> ToyType.CUDDLY.equals(toy.getType()))
                .count();
        long countTransformers = toys.stream()
                .filter(toy -> Objects.nonNull(toy.getType()))
                .filter(toy -> toy.getPrice() != 0)
                .filter(toy -> ToyType.TRANSFORMER.equals(toy.getType()))
                .count();
        return countCuddly + countTransformers;
    }

    public Double valueAllToys(List<Toy> toys) {
        return toys.stream()
                .filter(toy -> toy.getPrice() > 0)
                .map(Toy::getPrice)
                .reduce(0.0, Double::sum);
    }

    public Double valueAllToysAsChoiced(List<Toy> toys, ToyType toyTypeGivenByTheUser) {
        //W pierwszym kroku bronię się, gdy ktoś poda 'null' jako drugi parametr.
        if (Objects.isNull(toyTypeGivenByTheUser)) {
            return 0.0;
        }
        //tutaj wiem, że drugi parametr metody (toyTypeGivenByTheUser) nie jest nullem więc mogę go użyć w metodzie .filter(toy -> ...)
        return toys.stream()
                .filter(toy -> toyTypeGivenByTheUser.equals(toy.getType()))
                .map(Toy::getPrice)
                .reduce(0.0, Double::sum);
    }

    public Optional<Double> maxPrice(List<Toy> toys) {
        return toys.stream()
                .filter(toy -> toy.getPrice() > 0)
                .map(Toy::getPrice)
                .max(Double::compareTo);
    }

    public Optional<Double> maxPriceTransformers(List<Toy> toys) {
        return toys.stream()
                .filter(toy -> ToyType.TRANSFORMER.equals(toy.getType()))
                .map(Toy::getPrice)
                .max(Double::compareTo);
    }

    public Optional<Double> maxPriceCuddly(List<Toy> toys) {
        return toys.stream()
                .filter(toy -> ToyType.CUDDLY.equals(toy.getType()))
                .map(Toy::getPrice)
                .max(Double::compareTo);
    }

    public Optional<Double> minPrice(List<Toy> toys) {
        return toys.stream()
                .filter(toy -> toy.getPrice() > 0)
                .map(Toy::getPrice)
                .min(Double::compareTo);
    }

    public Optional<Double> minPriceTransformers(List<Toy> toys) {
        return toys.stream()
                .filter(toy -> ToyType.TRANSFORMER.equals(toy.getType()))
                .map(Toy::getPrice)
                .min(Double::compareTo);
    }

    public Optional<Double> minPriceCuddly(List<Toy> toys) {
        return toys.stream()
                .filter(toy -> ToyType.CUDDLY.equals(toy.getType()))
                .map(Toy::getPrice)
                .min(Double::compareTo);
    }

    public Double avergePriceCuddlyAndTransformer(List<Toy> toys) {
        Double sumOfTransformers = toys.stream()
                .filter(toy -> Objects.nonNull(toy.getType()))
                .filter(toy -> ToyType.TRANSFORMER.equals(toy.getType()))
                .map(Toy::getPrice)
                .reduce(0.0, Double::sum);


        Double sumOfCuddly = toys.stream()
                .filter(toy -> Objects.nonNull(toy.getType()))
                .filter(toy -> ToyType.CUDDLY.equals(toy.getType()))
                .map(Toy::getPrice)
                .reduce(0.0, Double::sum);
        double avergePrice = (sumOfTransformers + sumOfCuddly) / 2;
        return avergePrice;
//
    }

//    Double maxymalnaCena = toysToSold.stream()      // Znajduje najwyzszą cenę
//            .filter(toy -> toyType.equals(toy.getType()))
//            .map(Toy::getPrice)
//            .max((Double::compareTo))
//            .orElse(null);


//    public Toy getMoreExpensiveToy(List<Toy> toys, ToyType toyType) {
//        Toy mostExpensiveToy = toys.stream()
//                .filter(toy -> toyType.equals(toy.getType()))
////                .max((o1, o2) -> ((int) o1.getPrice()) - (int) o2.getPrice())
//                .max(Comparator.comparingInt(o -> ((int) o.getPrice())))
//// 'orElse(null)' mówi tyle, że gdy nie ma najdroższej zabawki to wtedy zwróć nulla
//                .orElse(null);
//
//        return mostExpensiveToy;
//    }
}