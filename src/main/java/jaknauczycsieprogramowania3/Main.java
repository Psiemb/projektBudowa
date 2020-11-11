package jaknauczycsieprogramowania3;

import jaknauczycsieprogramowania3.flatandoffice.flat.AftermarketFlat;
import jaknauczycsieprogramowania3.flatandoffice.flat.NewFlat;
import jaknauczycsieprogramowania3.flatandoffice.office.OfficeBrandNew;
import jaknauczycsieprogramowania3.flatandoffice.office.OfficeBreemCertified;
import jaknauczycsieprogramowania3.land.LandAbilityToGetBuildingPermit;
import jaknauczycsieprogramowania3.land.LandAgricultureArea;

public class Main {

    public static void main(String[] args) {

        PropertyMethods propertyMethods = new PropertyMethods();

        propertyMethods.addProperty(new AftermarketFlat("Mieszkanie", 32,
                "Zwierzyniecka", "32-091", "Kraków", true,
                4, 3, 32, 2, false,
                3));
        propertyMethods.addProperty(new NewFlat("Nowe mieszkanie", 38,
                "Cielecka", "32-091", "Tarnów", true,
                3, 5, 120, 23, true));
        propertyMethods.addProperty(new OfficeBrandNew("Exellent Office for rent", 700, "Do słońca", "30-213", "Kozierów",
                false, 15, 7,
                234, 43, true));
        propertyMethods.addProperty(new OfficeBreemCertified("Exellent Breem -Office for rent", 900, "Krzywa", "35-534", "Wola Zach",
                false, 25, 8,
                234, 66, true));
        propertyMethods.addProperty(new OfficeBrandNew("Exellent Leed - Office for rent", 1200, "Sucha", "30-343", "Narama",
                true, 34, 4,
                564, 77, false));
        propertyMethods.addProperty(new LandAbilityToGetBuildingPermit("Land in construction area", 1200, "Skośna", "23-313", "Kraków", true));
        propertyMethods.addProperty(new LandAgricultureArea("Land in agricultutre area", 5500, "Walcowa", "23-313", "Tarnów", false));
        propertyMethods.addProperty(new LandAbilityToGetBuildingPermit("Land with ability achieve building permit", 8900, "Jasna", "23-313", "Kraków", true));

        try {
        Property foundProperty = propertyMethods.findProperty("Krak");
        System.out.println(foundProperty.getPostCode());
    }catch (Exception e){
        System.out.println("Nie znaleziono nieruchomosci.");
    }
    }
}
