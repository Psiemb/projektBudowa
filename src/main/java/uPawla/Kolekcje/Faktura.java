package uPawla.Kolekcje;

//TODO: niepotrzebne importy - usunąć ctrl + alt + o
import java.text.SimpleDateFormat;
import java.util.Date;

public class Faktura {//TODO: między nazwą klasy a polami jeden wiersz odstępu
    private String firma;
    //TODO: nie trzeba pisać w polu 'akcpeptacjaFaktury' albo 'wartoscFaktury'. Jesteścmy w klasie 'Faktura' więc wystarczy samo 'wartość' i 'zaakceptowana'
    private boolean akceptacjaFaktury;
    private double wartoscFaktury;

    public Faktura(String firma, boolean akceptacjaFaktury, double wartoscFaktury) {
        this.firma = firma;
        this.akceptacjaFaktury = akceptacjaFaktury;
        this.wartoscFaktury = wartoscFaktury;
    }

    public String getFirma() {
        return firma;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }

    public boolean isAkceptacjaFaktury() {
        return akceptacjaFaktury;
    }

    public void setAkceptacjaFaktury(boolean akceptacjaFaktury) {
        this.akceptacjaFaktury = akceptacjaFaktury;
    }

    public double getWartoscFaktury() {
        return wartoscFaktury;
    }

    public void setWartoscFaktury(double wartoscFaktury) {
        this.wartoscFaktury = wartoscFaktury;
    }

    //TODO: toString
}
