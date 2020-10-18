package uPawla.settery;

public class Kubek {

    private String kolor;
    private double pojemnosc;

    public Kubek() {
    }

    public Kubek(String kolor, double pojemnosc) {
        System.out.println("Jestem w kontruktorze klasy Kubek");
        System.out.println("Stworze fizyczny kubek o kolorze " + kolor + ", i pojemnosc " + pojemnosc);
        this.kolor = kolor;
        this.pojemnosc = pojemnosc;
    }

    public String getKolor() {
        return kolor;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    public double getPojemnosc() {
        return pojemnosc;
    }

    public void setPojemnosc(double pojemnosc) {
        this.pojemnosc = pojemnosc;
    }

    @Override
    public String toString() {
        return "Kubek{" +
                "kolor='" + kolor + '\'' +
                ", pojemnosc=" + pojemnosc +
                '}';
    }
}
