package uPawla.Kolekcje.listy;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class ListyCzlowiekMain {

    public static void main(String[] args) {
        Czlowiek czlowiek2 = new Czlowiek("Michal",24, false);
        Czlowiek czlowiek3 = new Czlowiek("Jan",64, true);

        List<Czlowiek> segregator = new ArrayList();
        System.out.println("Ilosc elementow w segregatorze = " +segregator.size());
        System.out.println("Czy segregator jest pusty? " +segregator.isEmpty());

        segregator.add(new Czlowiek("Maksymilian",14, false));
        segregator.add(new Czlowiek("Ernest",11, false));
        segregator.add(new Czlowiek("Piotr",67, true));
        segregator.add(new Czlowiek(null,84, false));
        segregator.add(new Czlowiek("Pawel",14, true));
        segregator.add(czlowiek2);
        segregator.add(czlowiek3);

        System.out.println("Ilosc elementow w segregatorze = " +segregator.size());
        System.out.println("Czy segregator jest pusty? " +segregator.isEmpty());


        List<Czlowiek> daltonisci = segregator.stream()
                .filter(Czlowiek::isDaltonista)
//                .filter(aktualnyCzlowiek -> aktualnyCzlowiek.isDaltonista())
                .collect(Collectors.toList());

        System.out.println("ilosc daltonistow = " + daltonisci.size());

        List<Czlowiek> pelnoletni = segregator.stream()
                .filter(chlop -> chlop.getWiek() > 18)
                .collect(Collectors.toList());
        System.out.println("Ilość osób pełnoletnich: " + pelnoletni.size());

        segregator.stream()
                .filter(chlop -> !chlop.isDaltonista())
                .filter(chlop -> chlop.getWiek() < 50)
                .collect(Collectors.toList());

        System.out.println();


//        czlowiek.toString()
        List<Czlowiek> dlugieImie = segregator.stream()
                .filter(chlop -> Objects.nonNull(chlop.getImie()))
//                .filter(chlop -> chlop.getImie() != null)  to samo co wyżej
                .filter(chlop -> chlop.getImie().length() > 8)
                .collect(Collectors.toList());

        System.out.println("Ilość osob o imieniu dluzszym niz 8 znakow: " + dlugieImie.size());

        List<Czlowiek> literaP = segregator.stream()
                .filter(chlop -> Objects.nonNull(chlop.getImie()))
                .filter(chlop -> chlop.getImie().startsWith("P"))
                .collect(Collectors.toList());
        System.out.println("Osoby z imieniem rozpoczynającym się na P " + literaP.size());

        literaP.forEach(chlop -> System.out.println(chlop.getImie()));

        List<Czlowiek> osobaZe = segregator.stream()
                .filter(osoba -> Objects.nonNull(osoba.getImie()))
                .filter(osoba -> osoba.getWiek() > 10)
                .filter(osoba -> osoba.getImie().contains("e"))
                .collect(Collectors.toList());

        // mapowanie obiektu na inny obiekt

        List<String> imiona = segregator.stream()
                .map(osoba -> osoba.getImie())
//                .filter(imie -> imie.)
                .collect(Collectors.toList());


        osobaZe.forEach(osoba -> System.out.println(osoba.getImie() + " " + osoba.getWiek() + " " + osoba.isDaltonista()));

        System.out.println(imiona);
    }

}
