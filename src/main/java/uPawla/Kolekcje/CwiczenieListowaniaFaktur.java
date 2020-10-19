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


        //TODO: nazwa 'fakturaSumaFirmaA' nie jest dobrą nazwą. Ponieważ ten stream nie filtruje po nazwie firmy
        //TODO: w dalszym ciągu ta nazwa nie jest dobra :)
        Double fakturaSumaFirmaA = faktury.stream()
                .filter(f -> !f.isZaakceptowana())
                //TODO: IntelliJ świeci Ci 'f.getWartoscFaktury()' na zółto -> znaczy, że można lepiej to zapisać. UStaw kursor na zółtym polu i kliknij
                //TODO: alt + enter i zrób to co sugeruje IntellJ.
                .map(Faktura::getWartosc)  //.map(f -> f.getWartosc())  -zostawiam ten opis w celach szkoleniowych abym mógł wrócić
                .reduce(0.0, Double::sum);


        System.out.println(fakturaSumaFirmaA);

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


    }
}
