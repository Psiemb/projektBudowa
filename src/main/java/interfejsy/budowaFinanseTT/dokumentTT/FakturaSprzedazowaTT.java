package interfejsy.budowaFinanseTT.dokumentTT;

import interfejsy.budowaFinanseTT.DokumentFinansowyTT;

public class FakturaSprzedazowaTT implements DokumentFinansowyTT {
    private TypDokumentuTT typTT;
    private double wartoscTT;
    private String komuSprzedajemyTT;

    public FakturaSprzedazowaTT(TypDokumentuTT typTT, double wartoscTT, String komuSprzedajemyTT) {
        this.typTT = typTT;
        this.wartoscTT = wartoscTT;
        this.komuSprzedajemyTT = komuSprzedajemyTT;
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

    public String getKomuSprzedajemyTT() {
        return komuSprzedajemyTT;
    }

    public void setKomuSprzedajemyTT(String komuSprzedajemyTT) {
        this.komuSprzedajemyTT = komuSprzedajemyTT;
    }

    @Override
    public String toString() {
        return "FakturaSprzedazowaTT{" +
                "typTT=" + typTT +
                ", wartoscTT=" + wartoscTT +
                ", komuSprzedajemyTT='" + komuSprzedajemyTT + '\'' +
                '}';
    }
}
