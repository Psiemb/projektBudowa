package interfejsy.budowaFinanse;

import interfejsy.budowaFinanse.dokument.FakturaZakupowa;
import interfejsy.budowaFinanse.dokument.Kara;
import interfejsy.budowaFinanse.dokument.TypDokumentu;

import java.util.ArrayList;
import java.util.List;

public class BudowaFinanseMain {

    public static void main(String[] args) {
        
        List<DokumentFinansowy> dokumentyFinansowe = new ArrayList<>();
        Ksiegowa krysia = new Ksiegowa();

        Kara kara = new Kara(TypDokumentu.KARA, 100, "PIP");
        FakturaZakupowa fakturaZakupowa = new FakturaZakupowa(TypDokumentu.FAKTURA_ZAKUPOWA, 200, "FirmaA");

        dokumentyFinansowe.add(fakturaZakupowa);
        dokumentyFinansowe.add(kara);

        double wynikObliczenia = krysia.oblicz(dokumentyFinansowe);

        System.out.println(wynikObliczenia);

    }
}
