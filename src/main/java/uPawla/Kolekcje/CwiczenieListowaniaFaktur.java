package uPawla.Kolekcje;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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


        //TODO: nazwa 'fakturaSumaFirmaA' nie jest dobrą nazwą. Ponieważ ten stream nie filtruje po nazwie firmy
        Double fakturaSumaFirmaA = faktury.stream()
                .filter(f -> !f.isAkceptacjaFaktury())
                //TODO: IntelliJ świeci Ci 'f.getWartoscFaktury()' na zółto -> znaczy, że można lepiej to zapisać. UStaw kursor na zółtym polu i kliknij
                //TODO: alt + enter i zrób to co sugeruje IntellJ.
                .map(f -> f.getWartoscFaktury())
                .reduce(0.0, Double::sum);
        //.max(Double::compareTo);

        System.out.println(fakturaSumaFirmaA);

        Optional<Double> fakturaMaxFirmaB = faktury.stream()
                //TODO: porównując Stringi lepiej używać metody 'equalsIgnoreCase' jeśli kod nie jest czuły na małe i wielkie litery.
//                .filter(f -> f.getFirma().equalsIgnoreCase("FirmaB"))
                //TODO: obrona przed null'ami
                .filter(f -> f.getFirma().equals("FirmaB"))
                .map(Faktura :: getWartoscFaktury)
                //.max(Double::compareTo);
                .max((o1, o2) -> o1.compareTo(o2));

        System.out.println(fakturaMaxFirmaB);

        Optional<Double> fakturaMinFirmaC = faktury.stream()
                .filter(f -> f.getFirma().equals("FirmaC"))
                //TODO; tu to samo jeśli chodzi o podpowiedź IntelliJ.
                .map(f -> f.getWartoscFaktury())
                .min(Double::compareTo);

        System.out.println(fakturaMinFirmaC);


    }
}
