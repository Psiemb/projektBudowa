package uPawla.Kolekcje;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class MojaKsiegowa {

    public Double obliczanieSumyKosztow(List<Podwykonawca> wydatki) {
        Double reduce = wydatki.stream()
                .filter(p -> Objects.nonNull(p.getWartosc()))
                .map(Podwykonawca::getWartosc)
                .reduce(0.0, Double::sum);

        return reduce;
    }

    public Double obliczenieSumyZarobkow(List<Zleceniodawca> zarobki) {
        return zarobki.stream()
                .filter(z -> Objects.nonNull(z.getWartosc()))
                .map(Zleceniodawca::getWartosc)
                .reduce(0.0, Double::sum);
//        return obliczenieSumyZarobkow(zarobki);
    }

    public Optional<Double> faturaMinimalnaFirmaC(List<Faktura> faktury) {
        Optional<Double> firmaC = faktury.stream()
                .filter(f -> Objects.nonNull(f.getFirma()))
                .filter(f -> f.getFirma().equals("FirmaC"))
                .filter(obj -> true)  //.filter(Objects::nonNull)
                .map(Faktura::getWartosc)
                .min(Double::compareTo);
        return firmaC;
    }

    public Double fakturaMaxymalnaFirmaB(List<Faktura> faktury) {
        return faktury.stream()
                .filter(f -> Objects.nonNull(f.getFirma()))
                .filter(f -> f.getFirma().equalsIgnoreCase("FirmaB"))
                .map(Faktura::getWartosc)
                .max(Double::compareTo)
                .get();//.max((o1, o2) -> o1.compareTo(o2));  - zostawiam ten opis w celach szkoleniowych

//        return fakturaMaxymalnaFirmaB(faktury);
    }

    public Double fakturyZaakceptowane(List<Faktura> faktury) {
        return faktury.stream()
                .filter(f -> !f.isZaakceptowana())
                .map(Faktura::getWartosc)  //.map(f -> f.getWartosc())  -zostawiam ten opis w celach szkoleniowych abym mógł wrócić
                .reduce(0.0, Double::sum);

//        return fakturyZaakceptowane(faktury);
    }


}
