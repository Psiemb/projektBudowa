package metody.biuro;

public class Czytelnik {

    public String czytamZPapieru(Papier papier) {
        if (papier.getNapisNaPapierze() == null) {
            return "Oj, karta jest pusta";
        } else {
            return papier.getNapisNaPapierze();
        }
    }
}
