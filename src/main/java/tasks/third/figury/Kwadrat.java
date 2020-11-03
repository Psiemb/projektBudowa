package tasks.third.figury;

import tasks.third.FiguryPlaskie;

public class Kwadrat extends FiguryPlaskie {
    private double wymiarKwadratu;

    public Kwadrat(double wymiarA) {
        this.wymiarKwadratu = wymiarA;
    }

    public double getWymiarKwadratu() {
        return wymiarKwadratu;
    }

    public void setWymiarKwadratu(double wymiarKwadratu) {
        this.wymiarKwadratu = wymiarKwadratu;
    }

    @Override
    public double pole() {
        double pole = wymiarKwadratu * wymiarKwadratu;
        System.out.println("Obwód kwqdratu wynosi: " + pole);
        return pole;

    }

    @Override
    public double obwod() {
        double obwod = 4 * wymiarKwadratu;
        System.out.println("Obwód kwadratu wynosi: " + obwod);
        return obwod;
    }

    @Override
    public String toString() {
        return "Kawdrat{" +
                "wymiarKwadratu=" + wymiarKwadratu +
                '}';
    }
}
