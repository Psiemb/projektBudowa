package tasks.third.figury;

import tasks.third.FiguryPlaskie;

public class TrojkatProstokatny extends FiguryPlaskie {

    private double wymiarPodstawy;
    private double wymiarH;

    public TrojkatProstokatny(double wymiarPodstawy, double wymiarH) {
        this.wymiarPodstawy = wymiarPodstawy;
        this.wymiarH = wymiarH;
    }

    public double getWymiarPodstawy() {
        return wymiarPodstawy;
    }

    public void setWymiarPodstawy(double wymiarPodstawy) {
        this.wymiarPodstawy = wymiarPodstawy;
    }

    public double getWymiarH() {
        return wymiarH;
    }

    public void setWymiarH(double wymiarH) {
        this.wymiarH = wymiarH;
    }

    @Override
    public double pole() {
        double pole = 0.5 * wymiarPodstawy * wymiarH;
        System.out.println("Pole trójkąta prostokątnego wynosi: " + pole);
        return pole;
    }

    @Override
    public double obwod() {
        double obwod = wymiarPodstawy + wymiarH + Math.sqrt(wymiarPodstawy * wymiarPodstawy + wymiarH * wymiarH);
        System.out.println("Obwód trójkąta prostokątnego wynosi: " + obwod);
        return obwod;
    }

    @Override
    public String toString() {
        return "Trojkat{" +
                "wymiarPodstawy=" + wymiarPodstawy +
                ", wymiarH=" + wymiarH +
                '}';
    }
}
