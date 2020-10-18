package uPawla.Kolekcje.listy;

public class Czlowiek {

    private String imie;
    private int wiek;
    private boolean daltonista;
    private double height;
private double a;

    public Czlowiek(String imie, int wiek, boolean daltonista) {
        this.imie = imie;
        this.wiek = wiek;
        this.daltonista = daltonista;
    }
    public Czlowiek(String imie, int wiek, boolean daltonista, double height) {
        this.imie = imie;
        this.wiek = wiek;
        this.daltonista = daltonista;
        this.height = height;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public boolean isDaltonista() {
        return daltonista;
    }

    public void setDaltonista(boolean daltonista) {
        this.daltonista = daltonista;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Czlowiek{" +
                "imie='" + imie + '\'' +
                ", wiek=" + wiek +
                ", daltonista=" + daltonista +
                ", height=" + height +
                '}';
    }
}
