package jaknauczycsieprogramowania3.flatandoffice.flat;

public class AftermarketFlat extends AbstractFlatForRent {
    private double ageOfProperty;


    public AftermarketFlat(String nameOfAdvertisement, double size, String streetName, String postCode, String city, boolean isDirectAdvertisement, int volumeOfRooms, int level, int buildingNumber, int localNumber, boolean isBalcony, double ageOfProperty) {
        super(nameOfAdvertisement, size, streetName, postCode, city, isDirectAdvertisement, volumeOfRooms, level, buildingNumber, localNumber, isBalcony);
        this.ageOfProperty = ageOfProperty;
    }

    public double getAgeOfProperty() {
        System.out.println("Wiek nieruchomości.");
        return ageOfProperty;
    }

    @Override
    public String getNameOfAdvertisement() {
        return "Ta nieruchomość ma:" + ageOfProperty +"lat";
    }
}
