package constructionEquipmentBase.util;

import constructionEquipmentBase.constructionSite.ConstructionSite;

public class InformationDisplay {

    public void displayConstructionSiteInformation(ConstructionSite constructionSite) {
        System.out.println("Informacje podstawowe:");
        System.out.println("Budowa o nazwie " + constructionSite.getName());
        System.out.println();
        System.out.println("Informacje kadorewe:");
        System.out.println("Kierownik budowy: " + constructionSite.getSiteManager().getFirstName() + " " + constructionSite.getSiteManager().getLastName());
        System.out.println();
        System.out.println("Informacje adresowe:");
        System.out.println("Kod pocztowy: " + constructionSite.getAddress().getPostCode());
        System.out.println("Nazwa miejcowości: "  + constructionSite.getAddress().getCity());
        System.out.println("Nr działek: " + constructionSite.getAddress().getBuildingPlotNumber());
        System.out.println("Nazwa ulicy: " + constructionSite.getAddress().getStreet());
        System.out.println("Aktualny stan osobowy: " + constructionSite.getPersonalFinances().getCurrentPersonalStatus());



    }
}
