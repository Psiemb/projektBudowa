package uPawla.Kolekcje.productList;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainProduct {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();
        list.add(new Product("Masło"));
        list.add(new Product("Piwko"));
        list.add(new Product("Chleb"));

        List<Product> filteredList = list.stream()
                .filter(p -> p.getName().endsWith("o"))
                .collect(Collectors.toList());
        System.out.println("Przefiltrowana lista: " + filteredList + "\n");

        System.out.println(list);

        removeButter(list);

        System.out.println(list.contains(new Product("Chleb")));

        System.out.println(list);
    }
    private static void removeButter(List<Product> list) {
        Product butter =new Product("Masło");
        list.remove(butter);
    }
}
