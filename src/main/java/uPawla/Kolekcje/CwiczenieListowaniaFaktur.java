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


        Double fakturaSumaFirmaA = faktury.stream()
                .filter(f -> !f.isAkceptacjaFaktury())
                .map(f -> f.getWartoscFaktury())
                .reduce(0.0, Double::sum);
        //.max(Double::compareTo);

        System.out.println(fakturaSumaFirmaA);

        Optional<Double> fakturaMaxFirmaB = faktury.stream()
                .filter(f -> f.getFirma().equals("FirmaB"))
                .map(Faktura :: getWartoscFaktury)
                //.max(Double::compareTo);
                .max((o1, o2) -> o1.compareTo(o2));

        System.out.println(fakturaMaxFirmaB);

        Optional<Double> fakturaMinFirmaC = faktury.stream()
                .filter(f -> f.getFirma().equals("FirmaC"))
                .map(f -> f.getWartoscFaktury())
                .min(Double::compareTo);

        System.out.println(fakturaMinFirmaC);


    }
}
