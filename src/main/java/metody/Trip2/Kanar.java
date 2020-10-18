package metody.Trip2;

public class Kanar {

    public String czySkasowany(Bilet bilet) {
        if (bilet.isSkasowany()) {
            return "Bilet jest skasowany można jechać dalej.";
        } else {
            return "Bilet nie skasowany. Mandat 100zł";
        }
    }
}
