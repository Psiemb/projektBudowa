package uPawla.Kolekcje;

public class Podwykonawca {

    private String nazwa;
    private double wartosc;

    public Podwykonawca(String nazwa, double wartosc) {
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
        return "Podwykonawca{" +
                "nazwa='" + nazwa + '\'' +
                ", wartosc=" + wartosc +
                '}';
    }
}
