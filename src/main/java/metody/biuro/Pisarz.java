package metody.biuro;

public class Pisarz {

    private String s = " DD";

    public void piszNaPapierze(Papier papier) {
        papier.setNapisNaPapierze("Litwo ojczyzno moja");
    }

    public void piszKonkretnyTekst(Papier papier, String napis) {
        papier.setNapisNaPapierze(napis);
    }
}
