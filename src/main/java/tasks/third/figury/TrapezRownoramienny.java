package tasks.third.figury;

import tasks.third.FiguryPlaskie;

public class TrapezRownoramienny extends FiguryPlaskie {
    private double wymiarA;
    private double wymiarB;
    private double wysokoscH;

    public double getWymiarA() {
        return wymiarA;
    }

    public void setWymiarA(double wymiarA) {
        this.wymiarA = wymiarA;
    }

    public double getWymiarB() {
        return wymiarB;
    }

    public void setWymiarB(double wymiarB) {
        this.wymiarB = wymiarB;
    }

    public double getWysokoscH() {
        return wysokoscH;
    }

    public void setWysokoscH(double wysokoscH) {
        this.wysokoscH = wysokoscH;
    }

    public TrapezRownoramienny(double wymiarA, double wymiarB, double wysokoscH) {
        this.wymiarA = wymiarA;
        this.wymiarB = wymiarB;
        this.wysokoscH = wysokoscH;
    }


    @Override
    public double pole() {
        double pole = 0.5 * (wymiarA + wymiarB) * wysokoscH;
        System.out.println("Obwód trapezu równoramiennego wynosi: " + pole);
        return pole;
    }

    @Override
    public double obwod() {
        double obwod = (wymiarA + wymiarB) +0.5*(wymiarA-wymiarB)*wysokoscH;
        System.out.println("Obwód trapezu równoramiennego wynosi: " + obwod);
        return obwod;
    }

    @Override
    public String toString() {
        return "TrapezRownoramienny{" +
                "wymiarA=" + wymiarA +
                ", wymiarB=" + wymiarB +
                ", wysokoscH=" + wysokoscH +
                '}';
    }
}
