package interfejsy.budowaFinanse.dokument;

import interfejsy.budowaFinanse.DokumentFinansowy;

public class FakturaSprzedazowa implements DokumentFinansowy {

    private TypDokumentu typDokumentu;
    private double wartosc;
    private String komuSprzedajemy;

    public FakturaSprzedazowa(TypDokumentu typDokumentu, double wartosc, String komuSprzedajemy) {
        this.typDokumentu = typDokumentu;
        this.wartosc = wartosc;
        this.komuSprzedajemy = komuSprzedajemy;
    }
    @Override
    public TypDokumentu getTyp() {
        return typDokumentu;
    }

    public void setTypDokumentu(TypDokumentu typDokumentu) {
        this.typDokumentu = typDokumentu;
    }

    @Override
    public double getWartosc() {
        return wartosc;
    }

    public void setWartosc(double wartosc) {
        this.wartosc = wartosc;
    }

    public String getKomuSprzedajemy() {
        return komuSprzedajemy;
    }

    public void setKomuSprzedajemy(String komuSprzedajemy) {
        this.komuSprzedajemy = komuSprzedajemy;
    }

    //TODO: implements DokumentFinansowy
    //TODO: gettery / settery / construktor
}
