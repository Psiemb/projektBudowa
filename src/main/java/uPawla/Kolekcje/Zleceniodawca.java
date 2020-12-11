package uPawla.Kolekcje;

public class Zleceniodawca {

    private String nazwa;
    private double wartosc;

    public Zleceniodawca(String nazwa, double wartosc) {
        this.nazwa = nazwa;
        this.wartosc = wartosc;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public double getWartosc() {
        return wartosc;
    }

    public void setWartosc(double wartosc) {
        this.wartosc = wartosc;
    }

    @Override
    public String toString() {
        return "Zleceniodawca{" +
                "nazwa='" + nazwa + '\'' +
                ", wartosc=" + wartosc +
                '}';
    }
}
