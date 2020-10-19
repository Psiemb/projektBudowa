package uPawla.Kolekcje;

//TODO: niepotrzebne importy - usunąć ctrl + alt + o

public class Faktura {//TODO: między nazwą klasy a polami jeden wiersz odstępu

    private String firma;
    //TODO: nie trzeba pisać w polu 'akcpeptacjaFaktury' albo 'wartoscFaktury'. Jesteścmy w klasie 'Faktura' więc wystarczy samo 'wartość' i 'zaakceptowana'
    private boolean zaakceptowana;
    private double wartosc;

    public Faktura(String firma, boolean zaakceptowana, double wartosc) {
        this.firma = firma;
        this.zaakceptowana = zaakceptowana;
        this.wartosc = wartosc;
    }

    public String getFirma() {
        return firma;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }

    public boolean isZaakceptowana() {
        return zaakceptowana;
    }

    public void setZaakceptowana(boolean zaakceptowana) {
        this.zaakceptowana = zaakceptowana;
    }

    public double getWartosc() {
        return wartosc;
    }

    public void setWartosc(double wartosc) {
        this.wartosc = wartosc;
    }

    //TODO: toString

    @Override
    public String toString() {
        return "Faktura{" +
                "firma='" + firma + '\'' +
                ", zaakceptowana=" + zaakceptowana +
                ", wartosc=" + wartosc +
                '}';
    }
}
