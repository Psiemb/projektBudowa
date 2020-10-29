package interfejsy.budowaFinanse;

import interfejsy.budowaFinanse.dokument.TypDokumentu;

import java.util.List;

public class Ksiegowa {

    public double oblicz(List<DokumentFinansowy> dokumentyFinansowe) {

        Double koszt = dokumentyFinansowe.stream()
                .filter(dok -> TypDokumentu.KARA.equals(dok.getTyp()) || TypDokumentu.FAKTURA_ZAKUPOWA.equals(dok.getTyp()))
                .map(DokumentFinansowy::getWartosc)
                .reduce(0.0, Double::sum);

        Double zysk = dokumentyFinansowe.stream()
                .filter(dok -> TypDokumentu.FAKTURA_SPRZEDAZOWA.equals(dok.getTyp()))
                .map(DokumentFinansowy::getWartosc)
                .reduce(0.0, Double::sum);

        return zysk - koszt;


    }
}
