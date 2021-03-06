package tasks.third.figury;

import tasks.third.FiguryPlaskie;

public class TrapezRownoramienny extends FiguryPlaskie {
    private double wymiarA;
    private double wymiarB;
    private double wysokoscH;

    public double getWymiarA() {
        return wymiarA;
    }

    public TrapezRownoramienny() {
    }

    public TrapezRownoramienny(double wymiarA, double wymiarB, double wysokoscH) {
        this.wymiarA = wymiarA;
        this.wymiarB = wymiarB;
        this.wysokoscH = wysokoscH;
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


    @Override
    public double pole() {
        double pole = 0.5 * (wymiarA + wymiarB) * wysokoscH;
        System.out.println("Obwód trapezu równoramiennego wynosi: " + pole);
        return pole;
    }

    @Override
    public double obwod() {
        double obwod;
        if (wymiarA > 0 & wymiarB >0 & wysokoscH > 0) {
            obwod= wymiarA+wymiarB+2*Math.sqrt(wymiarA*wymiarA/4 - wymiarA*wymiarB/2+wymiarB*wymiarB/4+wysokoscH*wysokoscH);
        System.out.println("Obwód trapezu równoramiennego wynosi: " + obwod);}
        else {obwod = 0; System.out.println("Wymiar musi byc większy od zera");}
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
