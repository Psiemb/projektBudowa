package uPawla.Kolekcje.listy;

public class Czlowiek2 {

    private String imie;
    private int wiek;
    private boolean daltonista;

    public Czlowiek2(String imie, int wiek, boolean daltonista) {
        this.imie = imie;
        this.wiek = wiek;
        this.daltonista = daltonista;
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

    @Override
    public String toString() {
        return "Czlowiek{" +
                "imie='" + imie + '\'' +
                ", wiek=" + wiek +
                ", daltonista=" + daltonista +
                '}';
    }
}
