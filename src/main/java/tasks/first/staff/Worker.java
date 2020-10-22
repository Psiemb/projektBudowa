package tasks.first.staff;

import tasks.first.shop.Toy;
import tasks.first.shop.ToyType;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class Worker {

    public Long iloscZabawek(List<Toy> zabawki) {
        long iloscZabawek = zabawki.size();
        System.out.println(iloscZabawek);
        return iloscZabawek;
    }

    public Long countTransformer(List<Toy> zabawki) {
        return zabawki.stream()
                .filter(toy -> Objects.nonNull(toy.getType()))
                .filter(toy -> ToyType.TRANSFORMER.equals(toy.getType()))
                .count();
    }

    public Long countAll(List<Toy> zabawki) {
        long countCuddly = zabawki.stream()
                .filter(toy -> Objects.nonNull(toy.getType()))
                .filter(toy -> ToyType.CUDDLY.equals(toy.getType()))
                .count();
        long countTransformers = zabawki.stream()
                .filter(toy -> Objects.nonNull(toy.getType()))
                .filter(toy -> ToyType.TRANSFORMER.equals(toy.getType()))
                .count();
        long countAll = countCuddly + countTransformers;
        return countAll;
    }

    public Double wartoscWszystkichZabawek(List<Toy> zabawki) {
        return zabawki.stream()
                .filter(toy -> toy.getPrice() > 0)
                .map(Toy::getPrice)
                .reduce(0.0, Double::sum);
    }

    public Double wartoscTransformersow(List<Toy> zabawki) {
        return zabawki.stream()
                .filter(toy -> ToyType.TRANSFORMER.equals(toy.getType()))
                .map(Toy::getPrice)
                .reduce(0.0, Double::sum);
    }

    public Double wartoscZabawekCuddly(List<Toy> zabawki) {
        return zabawki.stream()
                .filter(toy -> ToyType.CUDDLY.equals(toy.getType()))
                .map(Toy::getPrice)
                .reduce(0.0, Double::sum);
    }

    public Optional<Double> maxCena(List<Toy> zabawki) {
        return zabawki.stream()
                .filter(toy -> toy.getPrice() > 0)
                .map(Toy::getPrice)
                .max(Double::compareTo);
    }

    public Optional<Double> maxCenaTransformersa(List<Toy> zabawki) {
        return zabawki.stream()
                .filter(toy -> ToyType.TRANSFORMER.equals(toy.getType()))
                .map(Toy::getPrice)
                .max(Double::compareTo);
    }

    public Optional<Double> maxCenaPrzytulanka(List<Toy> zabawki) {
        return zabawki.stream()
                .filter(toy -> ToyType.CUDDLY.equals(toy.getType()))
                .map(Toy::getPrice)
                .max(Double::compareTo);
    }

    public Optional<Double> minCena(List<Toy> zabawki) {
        return zabawki.stream()
                .filter(toy -> toy.getPrice() > 0)
                .map(Toy::getPrice)
                .min(Double::compareTo);
    }

    public Optional<Double> minCenaTransformersa(List<Toy> zabawki) {
        return zabawki.stream()
                .filter(toy -> ToyType.TRANSFORMER.equals(toy.getType()))
                .map(Toy::getPrice)
                .min(Double::compareTo);
    }

    public Optional<Double> minCenaPrzytulanka(List<Toy> zabawki) {
        return zabawki.stream()
                .filter(toy -> ToyType.CUDDLY.equals(toy.getType()))
                .map(Toy::getPrice)
                .min(Double::compareTo);
    }
}