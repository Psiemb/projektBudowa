package metody.Butelka;

public class Butelka {

    private double iloscLitrow;
    private double pojemnosc = 14;

    Butelka(double iloscLitrow) {
        this.iloscLitrow = iloscLitrow;
    }

    public double getIloscLitrow() {
        return iloscLitrow;
    }

    public boolean wlej(double iloscLitrowDoZmiany) {
        if ((iloscLitrowDoZmiany + iloscLitrow) <= pojemnosc)
            this.iloscLitrow += iloscLitrowDoZmiany;
        else {
            return false;
        }
        return true;
    }

    public boolean wylej(double iloscLitrowDoZminy) {
        if (iloscLitrowDoZminy < iloscLitrow)
            this.iloscLitrow -= iloscLitrowDoZminy;
        else
            return false;

        return true;
    }

    public boolean przelej(double iloscLitrowDoZmiany, Butelka butelkaONumerze) {
        if (this.wylej(iloscLitrowDoZmiany)) {
            return (butelkaONumerze.wlej(iloscLitrowDoZmiany));
        }
        if (!this.wylej(iloscLitrowDoZmiany) && iloscLitrowDoZmiany > 0) {
            System.out.println("Nie udało sie odlać zaplanowanej ilośc litrów. Brakło" + (iloscLitrowDoZmiany - iloscLitrow) + " litrów");
            return (butelkaONumerze.wylej(iloscLitrow));
        }
        if (!this.wlej(iloscLitrowDoZmiany)) {
            System.out.println("Pozostało litrów" + (iloscLitrowDoZmiany + iloscLitrow - pojemnosc));
            return (butelkaONumerze.wlej(pojemnosc - iloscLitrow));
        } else {
            return false;

        }
    }
}




