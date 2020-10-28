package interfejsy.budowaFinanse.dokument;

import interfejsy.budowaFinanse.DokumentFinansowy;

public class Kara implements DokumentFinansowy {

    private TypDokumentu typ;
    private double wartosc;
    private String ktoNalozyl;

    public Kara(TypDokumentu typ, double wartosc, String ktoNalozyl) {
        this.typ = typ;
        this.wartosc = wartosc;
        this.ktoNalozyl = ktoNalozyl;
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

    public String getKtoNalozyl() {
        return ktoNalozyl;
    }

    public void setKtoNalozyl(String ktoNalozyl) {
        this.ktoNalozyl = ktoNalozyl;
    }
}
