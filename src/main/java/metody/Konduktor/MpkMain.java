package metody.Konduktor;

public class MpkMain {
    public static void main(String[] args) {
        Bilet bilecik = new Bilet();
        Kasownik kas = new Kasownik();

        /////////////////////////////////////////////////////////////////////

        System.out.println(bilecik.isSkasowany());
        kas.skasujBilet(bilecik);
        System.out.println(bilecik.isSkasowany());

    }
}
