package metody.biuro;

public class BiuroMain {
    public static void main(String[] args) {

        Papier papier = new Papier();
        Pisarz pisarz = new Pisarz();
        Czytelnik czytelnik = new Czytelnik();


        papier.getNapisNaPapierze();
        System.out.println(papier.getNapisNaPapierze());

        pisarz.piszNaPapierze(papier);
        czytelnik.czytamZPapieru(papier);
        System.out.println(czytelnik.czytamZPapieru(papier));
        pisarz.piszKonkretnyTekst(papier, "Konkretny tekst");
        System.out.println(papier.getNapisNaPapierze());
    }
}
