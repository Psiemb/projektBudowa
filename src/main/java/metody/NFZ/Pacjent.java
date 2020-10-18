package metody.NFZ;

public class Pacjent {

    private double wzrost;
    private double waga;
    private double wspolczynnikBmi;

    Pacjent(double wzrost, double waga) {
        this.wzrost = wzrost;
        this.waga = waga;
    }

    public double getWzrost() {
        return wzrost;
    }

    public void setWzrost(double wzrost) {
        this.wzrost = wzrost;
    }

    public double getWaga() {
        return waga;
    }

    public void setWaga(double waga) {
        this.waga = waga;
    }

    public double getWspolczynnikBmi() {
        return wspolczynnikBmi;
    }

    public void setWspolczynnikBmi(double wspolczynnikBmi) {
        this.wspolczynnikBmi = wspolczynnikBmi;
    }

    //Metoda dodaje do aktualnej wagi kilogramy o ile przytył pacjent

    //ToDo: If dopisać
    public void schudnij(double kg) {
        if (kg > 0.1 * waga) System.out.println("Prawdopodobnie podałeś błędne wartości");
        waga = waga - kg;
    }

    public void przytyj(double iloscPrzytytychKilogramow) {
        if (iloscPrzytytychKilogramow < 0) {
            System.out.println("Blad");
            return;
        } else if (this.waga + iloscPrzytytychKilogramow > 500 || this.waga + iloscPrzytytychKilogramow < 30) {
            System.out.println("Blad - pewnie nie zyjesz");
            return;
        }
        this.waga = this.waga + iloscPrzytytychKilogramow;
    }
}
