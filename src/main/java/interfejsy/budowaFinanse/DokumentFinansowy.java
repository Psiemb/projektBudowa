package interfejsy.budowaFinanse;

import interfejsy.budowaFinanse.dokument.TypDokumentu;

public interface DokumentFinansowy {

    public abstract TypDokumentu getTyp();
    double getWartosc();
}
