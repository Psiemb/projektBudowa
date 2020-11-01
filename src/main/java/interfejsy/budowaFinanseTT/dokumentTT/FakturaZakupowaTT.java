package interfejsy.budowaFinanseTT.dokumentTT;

import interfejsy.budowaFinanseTT.DokumentFinansowyTT;

public class FakturaZakupowaTT implements DokumentFinansowyTT {

    private TypDokumentuTT typTT;
    private double wartoscTT;
    private String odKogoKupujemyTT;

    public FakturaZakupowaTT(TypDokumentuTT typTT, double wartoscTT, String odKogoKupujemyTT) {
        this.typTT = typTT;
        this.wartoscTT = wartoscTT;
        this.odKogoKupujemyTT = odKogoKupujemyTT;
    }

    @Override
    public TypDokumentuTT getTypTT() {
        return typTT;
    }

    public void setTypTT(TypDokumentuTT typTT) {
        this.typTT = typTT;
    }

    @Override
    public double getWatoscTT() {
        return wartoscTT;
    }

    public void setWartoscTT(double wartoscTT) {
        this.wartoscTT = wartoscTT;
    }

    public String getOdKogoKupujemyTT() {
        return odKogoKupujemyTT;
    }

    public void setOdKogoKupujemyTT(String odKogoKupujemyTT) {
        this.odKogoKupujemyTT = odKogoKupujemyTT;
    }

    @Override
    public String toString() {
        return "FakturaZakupowaTT{" +
                "typTT=" + typTT +
                ", wartoscTT=" + wartoscTT +
                ", odKogoKupujemyTT='" + odKogoKupujemyTT + '\'' +
                '}';
    }
}
