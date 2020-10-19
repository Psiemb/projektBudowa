package uPawla.Kolekcje;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;

public class CwiczenieListowaniaFaktur {
    public static void main(String[] args) {

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


        //TODO: nazwa 'fakturyZaakceptowaneSuma' nie jest dobrą nazwą. Ponieważ ten stream nie filtruje po nazwie firmy
        //TODO: w dalszym ciągu ta nazwa nie jest dobra :)
        Double fakturyZaakceptowaneSuma = faktury.stream()
                .filter(f -> !f.isZaakceptowana())
                //TODO: IntelliJ świeci Ci 'f.getWartoscFaktury()' na zółto -> znaczy, że można lepiej to zapisać. UStaw kursor na zółtym polu i kliknij
                //TODO: alt + enter i zrób to co sugeruje IntellJ.
                .map(Faktura::getWartosc)  //.map(f -> f.getWartosc())  -zostawiam ten opis w celach szkoleniowych abym mógł wrócić
                .reduce(0.0, Double::sum);


        System.out.println(fakturyZaakceptowaneSuma);

        // Optional<Double> fakturaMaxFirmaB = faktury.stream()
        //TODO: porównując Stringi lepiej używać metody 'equalsIgnoreCase' jeśli kod nie jest czuły na małe i wielkie litery.
//                .filter(f -> f.getFirma().equalsIgnoreCase("FirmaB"))
        //TODO: obrona przed null'ami
        Optional<Double> fakturaMaxFirmaB = faktury.stream()
                .filter(faktura -> Objects.nonNull(faktura.getFirma()))
                .filter(f -> f.getFirma().equalsIgnoreCase("FirmaB"))
                .map(Faktura::getWartosc)
                .max(Double::compareTo);//.max((o1, o2) -> o1.compareTo(o2));  - zostawiam ten opis w celach szkoleniowych

        System.out.println(fakturaMaxFirmaB);


        Optional<Double> fakturaMinFirmaC = faktury.stream()
                .filter(f -> Objects.nonNull(f.getFirma()))
                .filter(f -> f.getFirma().equals("FirmaC"))
                .filter(obj -> true)  //.filter(Objects::nonNull)
                //TODO; tu to samo jeśli chodzi o podpowiedź IntelliJ.
                .map(Faktura::getWartosc)
                .min(Double::compareTo);

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

        Double sumaKosztow = wydatki.stream()
                .filter(p -> Objects.nonNull(p.getWartosc()))
                .map(Podwykonawca::getWartosc)
                .reduce(0.0, Double::sum);

        Double sumaZarobku = zarobki.stream()
                .filter(z -> Objects.nonNull(z.getWartosc()))
                .map(Zleceniodawca::getWartosc)
                .reduce(0.0, Double::sum);


        if (sumaZarobku > sumaKosztow) {
            System.out.println("Firma zarobiła: " + (sumaZarobku - sumaKosztow) + " zł");
        }
        else {
            System.out.println("Firma ponisoła stratę w wysokości: " + (sumaKosztow - sumaZarobku) + " zł");

        }

    }
}
