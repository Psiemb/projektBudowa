package interfejsy.budowaFinanse.dokument;

import interfejsy.budowaFinanse.DokumentFinansowy;

public class FakturaZakupowa implements DokumentFinansowy {

    private TypDokumentu typ;
    private double wartosc;
    private String odKogoKupujemy;

    public FakturaZakupowa(TypDokumentu typ, double wartosc, String odKogoKupujemy) {
        this.typ = typ;
        this.wartosc = wartosc;
        this.odKogoKupujemy = odKogoKupujemy;
    }

    @Override
    public TypDokumentu getTyp() {
        return typ;
    }

    public void setTyp(TypDokumentu typ) {
        this.typ = typ;
    }

    @Override
    public double getWartosc() {
        return wartosc;
    }

    public void setWartosc(double wartosc) {
        this.wartosc = wartosc;
    }

    public String getOdKogoKupujemy() {
        return odKogoKupujemy;
    }

    public void setOdKogoKupujemy(String odKogoKupujemy) {
        this.odKogoKupujemy = odKogoKupujemy;
    }
}
