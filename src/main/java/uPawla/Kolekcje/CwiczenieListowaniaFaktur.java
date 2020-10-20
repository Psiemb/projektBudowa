package uPawla.Kolekcje;

import java.util.ArrayList;
import java.util.List;
//TODO: ctrl + alt + o
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;

public class CwiczenieListowaniaFaktur {
    public static void main(String[] args) {

        MojaKsiegowa teresa = new MojaKsiegowa();

        List<Faktura> faktury = new ArrayList<>();

        faktury.add(new Faktura("FirmaA", true, 40000.0));
        faktury.add(new Faktura("FirmaB", true, 80000.0));
        faktury.add(new Faktura("FirmaC", true, 3000.0));
        faktury.add(new Faktura("FirmaA", false, 250000.0));
        faktury.add(new Faktura("FirmaA", true, 50000.0));
        faktury.add(new Faktura("FirmaA", true, 90000.0));
        faktury.add(new Faktura("FirmaB", true, 800.0));
        faktury.add(new Faktura("FirmaA", true, 1000.0));
        faktury.add(new Faktura("FirmaB", false, 2678.0));
        faktury.add(new Faktura("FirmaC", true, 10.0));


        Double fakturyZaakceptowaneSuma = teresa.fakturyZaakceptowane(faktury);

        System.out.println(fakturyZaakceptowaneSuma);


        Double fakturaMaxFirmaB = teresa.fakturaMaxymalnaFirmaB(faktury);

        System.out.println(fakturaMaxFirmaB);


        Double fakturaMinFirmaC = teresa.faturaMinimalnaFirmaC(faktury).get();

        System.out.println(fakturaMinFirmaC);

        System.out.println("");
        System.out.println("-----------------------------------");
        System.out.println("");

        List<Podwykonawca> wydatki = new ArrayList<>();
        wydatki.add(new Podwykonawca("FirmaW1", 43234));
        wydatki.add(new Podwykonawca("FirmaW2", 82675));
        wydatki.add(new Podwykonawca("FirmaW3", 1111));
        wydatki.add(new Podwykonawca("FirmaW4", 867466));
        wydatki.add(new Podwykonawca("FirmaW5", 998989));

        List<Zleceniodawca> zarobki = new ArrayList<>();
        zarobki.add(new Zleceniodawca("FirmaZ1", 503040));
        zarobki.add(new Zleceniodawca("FirmaZ2", 604556));
        zarobki.add(new Zleceniodawca("FirmaZ3", 800000));
        zarobki.add(new Zleceniodawca("FirmaZ4", 100000));

        Double sumaKosztow = teresa.obliczanieSumyKosztow(wydatki);

        Double sumaZarobku = teresa.obliczenieSumyZarobkow(zarobki);


        if (sumaZarobku > sumaKosztow) {
            System.out.println("Firma zarobiła: " + (sumaZarobku - sumaKosztow) + " zł");
        }
        else {
            System.out.println("Firma ponisoła stratę w wysokości: " + (sumaKosztow - sumaZarobku) + " zł");

        }

    }
}
