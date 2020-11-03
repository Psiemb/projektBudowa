package tasks.third.figury;

import tasks.third.FiguryPlaskie;

public class Kolo extends FiguryPlaskie {
    private double promien;

    public Kolo(double promien) {
        this.promien = promien;
    }

    public double getPromien() {
        return promien;
    }

    public void setPromien(double promien) {
        this.promien = promien;
    }

    @Override
    public double pole() {
        double pole = Math.PI*promien*promien;
        System.out.println("Obwód koła wynosi: " + pole);
        return pole;
    }

    @Override
    public double obwod() {
        double obwod = 2*Math.PI*promien;
        System.out.println("Obwód koła wynosi: " + obwod);
        return obwod;
    }

    @Override
    public String toString() {
        return "Kolo{" +
                "promien=" + promien +
                '}';
    }
}
