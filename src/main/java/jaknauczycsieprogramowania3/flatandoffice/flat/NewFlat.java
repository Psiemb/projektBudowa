package jaknauczycsieprogramowania3.flatandoffice.flat;

public class NewFlat extends AbstractFlatForRent {

    public NewFlat(String nameOfAdvertisement, double size, String streetName, String postCode, String city, boolean isDirectAdvertisement, int volumeOfRooms, int level, int buildingNumber, int localNumber, boolean isBalcony) {
        super(nameOfAdvertisement, size, streetName, postCode, city, isDirectAdvertisement, volumeOfRooms, level, buildingNumber, localNumber, isBalcony);
    }
    public void flatPresentation(){
        System.out.println(" Podaj email a prześlemy Ci prezentację mieszkania.");
    }
}
