package interfejsy.budowaFinanseTT;

import java.util.List;

public class BudowaFinanseMainTT {
    public static void main(String[] args) {

        SiteManagerTT siteManagerTT = SiteManagerTT.utworzSiteManageraTT();

        List<DokumentFinansowyTT> dokumenciki = siteManagerTT.getDokumentyFinansowe();

//        List<DokumentFinansowyTT> karaTT = siteManagerTT.getKaraTT();
//        List<DokumentFinansowyTT> fakturaSprzedazowaTT = siteManagerTT.getFakturySprzedazoweTT();
//        List<DokumentFinansowyTT> fakturaZakupowaTT = siteManagerTT.getFakturyZakupoweTT();

        KsiegowaTT ksiegowaTT = new KsiegowaTT();

        double wynikobliczeniaTT = ksiegowaTT.obliczTT(dokumenciki); //ToDO aby można włożyć dokument finansowy a nie  karaTT, fakturaSorzedażwoaTT lub fakturaZakupowaTT

        System.out.println("Obliczone zyski wynosza: " + wynikobliczeniaTT);

//        List<DokumentFinansowyTT> dokumentFinansowyTT = new ArrayList<>();

//        KaraTT karaTT = new KaraTT(TypDokumentuTT.KARATT, 212, "Policja");
//
//        FakturaSprzedazowaTT fakturaSprzedazowaTT = new FakturaSprzedazowaTT(TypDokumentuTT.FAKTURASPRZEDAZOWATT, 231, "Activ");
//
//        FakturaZakupowaTT fakturaZakupowaTT = new FakturaZakupowaTT(TypDokumentuTT.FAKTURAZAKUPOWATT, 15,"Cemex");

//        dokumentFinansowyTT.add(karaTT);
//        dokumentFinansowyTT.add(fakturaSprzedazowaTT);
//        dokumentFinansowyTT.add(fakturaZakupowaTT);

//        System.out.println(wynikobliczeniaTT);

    }
}