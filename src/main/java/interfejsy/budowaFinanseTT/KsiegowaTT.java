package interfejsy.budowaFinanseTT;

import interfejsy.budowaFinanseTT.dokumentTT.TypDokumentuTT;

import java.util.List;

public class KsiegowaTT {

    public double obliczTT(List<DokumentFinansowyTT> dokumentyFinansoweTT) {

        Double koszt = dokumentyFinansoweTT.stream()
                .filter(dok -> TypDokumentuTT.KARATT.equals(dok.getTypTT()) || TypDokumentuTT.FAKTURAZAKUPOWATT.equals(dok.getTypTT()))
                .map(DokumentFinansowyTT::getWatoscTT)
                .reduce(0.0, Double::sum);

        Double zysk = dokumentyFinansoweTT.stream()
                .filter(dok -> TypDokumentuTT.FAKTURASPRZEDAZOWATT.equals(dok.getTypTT()))
                .map(DokumentFinansowyTT::getWatoscTT)
                .reduce(0.0, Double::sum);

        return zysk - koszt;


    }
}
