package uPawla.Kolekcje.naukaKolekcje;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class ListyZwierzeMain {
    public static void main(String[] args) {

        List<Zwierze> listaZwierzat = new ArrayList<>();

        listaZwierzat.add(new Zwierze("Tapir", 4,true,40,false ));
        listaZwierzat.add(new Zwierze("Słoń", 4,true,4000,false ));
        listaZwierzat.add(new Zwierze("Papuga", 2,false,0.5,true ));
        listaZwierzat.add(new Zwierze("Struś", 2,false,60,false ));
        listaZwierzat.add(new Zwierze("Kangur", 4,true,40,false ));
        listaZwierzat.add(new Zwierze("Rekin", 0,true,300,false ));

        System.out.println("Ilosc elementow w segregatorze : " + listaZwierzat.size());
        System.out.println("Czy lista jest pusta? " + listaZwierzat.isEmpty());


        List<Zwierze> zwierzetaMniejNiz4Nogi = listaZwierzat.stream()
                .filter(animal -> Objects.nonNull(animal.getNazwaZwierzecia()))
                .filter(animal -> Objects.nonNull(animal.getIloscNog()))
                .filter(animal -> Objects.nonNull(animal.isCzySsak()))
                .filter(animal -> Objects.nonNull(animal.getWaga()))
                .filter(animal -> Objects.nonNull(animal.isCzyUmieLatac()))
                .filter(animal -> animal.getIloscNog() < 3)
                .filter(animal -> !animal.isCzySsak())
                //.filter(animal -> animal.getNazwaZwierzecia().indexOf())
                .collect(Collectors.toList());

        System.out.println("Ilość osób spełniająych kryteria ...: " + zwierzetaMniejNiz4Nogi.size());

        zwierzetaMniejNiz4Nogi.forEach(animal -> System.out.println(animal.getNazwaZwierzecia() +" " + animal.getIloscNog() + " " +
                animal.isCzySsak() + " " + animal.getWaga() + " " + animal.isCzyUmieLatac()));


    }
}
