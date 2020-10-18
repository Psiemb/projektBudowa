package metody.Budowa;

public class KierownikBudowy {

    public double obliczKoszty(double wyplaty, double materialy, double podatki) {
        return wyplaty + materialy + podatki;
    }

    public double obliczKoszty(Koszt aktualneKoszty) {
        double wyplaty = aktualneKoszty.getWyplaty();
        double materialy = aktualneKoszty.getMaterialy();
        double podatki = aktualneKoszty.getPodatki();
        return wyplaty + materialy + podatki;
    }

}
