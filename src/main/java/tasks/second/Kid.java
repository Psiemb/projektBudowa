package tasks.second;

public class Kid extends Parent{

    private String kolorOczu;
    private boolean adoptowany;

    public Kid() {
        System.out.println(" I am a Kid without paramaters. ");
    }

    public Kid(double waga, double wrost, String nazwisko, double wiek, String kolorOczu, boolean adoptowany) {
        super(waga, wrost, nazwisko, wiek);
        this.kolorOczu = kolorOczu;
        this.adoptowany = adoptowany;
        System.out.println(" I am a Kid with paramaters. ");
    }

    public String isKolorOczu() {
        return kolorOczu;
    }

    public void setKolorOczu(String kolorOczu) {
        this.kolorOczu = kolorOczu;
    }

    public boolean isAdoptowany() {
        return adoptowany;
    }

    public void setAdoptowany(boolean adoptowany) {
        this.adoptowany = adoptowany;
    }

    @Override
    public String toString() {
        return "Kid{" +
                "kolorOczu=" + kolorOczu +
                ", adoptowany=" + adoptowany +
                '}';
    }
}
