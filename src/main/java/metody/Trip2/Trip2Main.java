package metody.Trip2;

public class Trip2Main {

    public static void main(String[] args) {
        Bilet bilet = new Bilet();
        Kanar kanar = new Kanar();
        Kasownik kasownik = new Kasownik();

        System.out.println("Wyświetl czy bilet jest dobry:" + bilet.isSkasowany());
        if (!bilet.isSkasowany()) {
            System.out.println(" Trzeba zakupić bilet i skasować w kasowniku");
        }
        System.out.println("Skasuj nowy bilet");
        kasownik.wykonajKasowanie();
        bilet.setSkasowany(true);
        kanar.czySkasowany(bilet);
        System.out.println(kanar.czySkasowany(bilet));

        kasownik.informacjaOdKanar(kanar, bilet);
        System.out.println(kasownik.informacjaOdKanar(kanar, bilet));
    }
}
