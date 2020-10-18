package uPawla.Kolekcje.naukaKolekcje;

public class Zwierze {

    private String nazwaZwierzecia;
    private int iloscNog;
    private boolean czySsak;
    private double waga;
    private boolean czyUmieLatac;

    public Zwierze(String nazwaZwierzecia, int iloscNog, boolean czySsak, double waga, boolean czyUmieLatac) {
        this.nazwaZwierzecia = nazwaZwierzecia;
        this.iloscNog = iloscNog;
        this.czySsak = czySsak;
        this.waga = waga;
        this.czyUmieLatac = czyUmieLatac;
    }

    public String getNazwaZwierzecia() {
        return nazwaZwierzecia;
    }

    public void setNazwaZwierzecia(String nazwaZwierzecia) {
        this.nazwaZwierzecia = nazwaZwierzecia;
    }

    public int getIloscNog() {
        return iloscNog;
    }

    public void setIloscNog(int iloscNog) {
        this.iloscNog = iloscNog;
    }

    public boolean isCzySsak() {
        return czySsak;
    }

    public void setCzySsak(boolean czySsak) {
        this.czySsak = czySsak;
    }

    public double getWaga() {
        return waga;
    }

    public void setWaga(double waga) {
        this.waga = waga;
    }

    public boolean isCzyUmieLatac() {
        return czyUmieLatac;
    }

    public void setCzyUmieLatac(boolean czyUmieLatac) {
        this.czyUmieLatac = czyUmieLatac;
    }
}
