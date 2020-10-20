package uPawla.Kolekcje;

import java.util.List;
import java.util.Objects;

public class MojaKsiegowa {

    public Double obliczanieSumyKosztow(List<Podwykonawca> wydatki) {
        wydatki.stream()
                .filter(p -> Objects.nonNull(p.getWartosc()))
                .map(Podwykonawca::getWartosc)
                .reduce(0.0, Double::sum);

        return obliczanieSumyKosztow(wydatki);
    }

    public Double obliczenieSumyZarobkow(List<Zleceniodawca> zarobki) {
        zarobki.stream()
                .filter(z -> Objects.nonNull(z.getWartosc()))
                .map(Zleceniodawca::getWartosc)
                .reduce(0.0, Double::sum);
        return obliczenieSumyZarobkow(zarobki);
    }

    public Double faturaMinimalnaFirmaC(List<Faktura> faktury) {
        faktury.stream()
                .filter(f -> Objects.nonNull(f.getFirma()))
                .filter(f -> f.getFirma().equals("FirmaC"))
                .filter(obj -> true)  //.filter(Objects::nonNull)
                .map(Faktura::getWartosc)
                .min(Double::compareTo);
        return faturaMinimalnaFirmaC(faktury);
    }

    public Double fakturaMaxymalnaFirmaB(List<Faktura> faktury) {
        faktury.stream()
                .filter(faktura -> Objects.nonNull(faktura.getFirma()))
                .filter(f -> f.getFirma().equalsIgnoreCase("FirmaB"))
                .map(Faktura::getWartosc)
                .max(Double::compareTo);//.max((o1, o2) -> o1.compareTo(o2));  - zostawiam ten opis w celach szkoleniowych

        return fakturaMaxymalnaFirmaB(faktury);
    }

    public Double fakturyZaakceptowane(List<Faktura> faktury) {
        faktury.stream()
                .filter(f -> !f.isZaakceptowana())
                .map(Faktura::getWartosc)  //.map(f -> f.getWartosc())  -zostawiam ten opis w celach szkoleniowych abym mógł wrócić
                .reduce(0.0, Double::sum);

        return fakturyZaakceptowane(faktury);
    }


}
