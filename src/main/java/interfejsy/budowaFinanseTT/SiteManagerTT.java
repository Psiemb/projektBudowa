package interfejsy.budowaFinanseTT;

import interfejsy.budowaFinanseTT.dokumentTT.FakturaSprzedazowaTT;
import interfejsy.budowaFinanseTT.dokumentTT.FakturaZakupowaTT;
import interfejsy.budowaFinanseTT.dokumentTT.KaraTT;
import interfejsy.budowaFinanseTT.dokumentTT.TypDokumentuTT;

import java.util.ArrayList;
import java.util.List;

public class SiteManagerTT {

//    private List<DokumentFinansowyTT> fakturyZakupoweTT;
//    private List<DokumentFinansowyTT> fakturySprzedazoweTT;
//    private List<DokumentFinansowyTT> karaTT;

    private List<DokumentFinansowyTT> dokumentyFinansowe;

    public SiteManagerTT() {
    }

    public List<DokumentFinansowyTT> getDokumentyFinansowe() {
        return dokumentyFinansowe;
    }
//    public List<DokumentFinansowyTT> getFakturyZakupoweTT() {
//        return fakturyZakupoweTT;
//    }
//
//    public List<DokumentFinansowyTT> getFakturySprzedazoweTT() {
//        return fakturySprzedazoweTT;
//    }
//
//    public List<DokumentFinansowyTT> getKaraTT() {
//        return karaTT;
//    }

    public static SiteManagerTT utworzSiteManageraTT(){
        SiteManagerTT siteManagerTT =new SiteManagerTT();
        siteManagerTT. dokumentyFinansowe = siteManagerTT.pobierzDokumenty();

        return siteManagerTT;
    }
    private static List<DokumentFinansowyTT> pobierzDokumenty(){
        List<DokumentFinansowyTT> dokumentFinansowyTTS =new ArrayList<>();

        dokumentFinansowyTTS.add(new KaraTT(TypDokumentuTT.KARATT, 34,"Policja"));
        dokumentFinansowyTTS.add(new KaraTT(TypDokumentuTT.KARATT, 23,"Straż miejską"));
        dokumentFinansowyTTS.add(new FakturaSprzedazowaTT(TypDokumentuTT.FAKTURASPRZEDAZOWATT, 552, "Activ- Wadowicka"));
        dokumentFinansowyTTS.add(new FakturaSprzedazowaTT(TypDokumentuTT.FAKTURASPRZEDAZOWATT, 552, "KG Group - Badtkiego"));
        dokumentFinansowyTTS.add(new FakturaZakupowaTT(TypDokumentuTT.FAKTURAZAKUPOWATT, 21, "RBS za stal"));
        dokumentFinansowyTTS.add(new FakturaZakupowaTT(TypDokumentuTT.FAKTURAZAKUPOWATT, 21, "PSB Marka za ceramika"));

        return dokumentFinansowyTTS;
    }

}
