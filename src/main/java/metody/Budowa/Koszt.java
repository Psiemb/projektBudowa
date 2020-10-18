package metody.Budowa;

public class Koszt {

    //filds -> pola
    private double wyplaty;
    private double podatki;
    private double materialy;

    public Koszt(double wyplaty, double podatki, double materialy) {
        this.wyplaty = wyplaty;
        this.podatki = podatki;
        this.materialy = materialy;
    }

    public double getWyplaty() {
        return wyplaty;
    }

    public double getPodatki() {
        return podatki;
    }


    public double getMaterialy() {
        return materialy;
    }
}
