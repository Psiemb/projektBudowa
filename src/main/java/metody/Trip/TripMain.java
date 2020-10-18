package metody.Trip;

public class TripMain {
    public static void main(String[] args) {
        Bilett bil = new Bilett();
        Kasownikk kaso = new Kasownikk();
        Kanarr kana = new Kanarr();

        System.out.println("Na początku bilet jest " + bil.isSkasowany());
        System.out.println("Teraz wkładam bilet do kasowanika ");
        kaso.kasujBilet(bil);
        System.out.println("Bilet został skasowany potwierdza to wartość: " +bil.isSkasowany());
        System.out.println("Kontrola biletów: " + kana.checkBilet(bil));

        System.out.println(kaso.okno(kana, bil));
    }
}
