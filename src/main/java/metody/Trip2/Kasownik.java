package metody.Trip2;

public class Kasownik {

    public void wykonajKasowanie() {
        System.out.println("Bilet został skasowany");
    }

    public String informacjaOdKanar(Kanar kanar, Bilet bilet) {
        if (kanar.czySkasowany(bilet).equals("Bilet jest skasowany można jechać dalej.")) {
            return " Kasownik wyświetla USMIECH";
        }
        return " SMUTEK";
    }
}
