package tasks.second;

public class Parent extends Human{

    private String nazwisko;
    private double wiek;

    public Parent() {
        System.out.println(" I am a Parent without paramaters. ");
    }

    public Parent(double waga, double wrost, String nazwisko, double wiek) {
        super(waga, wrost);
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        System.out.println(" I am a Parent with paramaters. ");
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public double getWiek() {
        return wiek;
    }

    public void setWiek(double wiek) {
        this.wiek = wiek;
    }

    @Override
    public String toString() {
        return "Parent{" +
                "nazwisko=" + nazwisko +
                ", wiek=" + wiek +
                '}';
    }
}
