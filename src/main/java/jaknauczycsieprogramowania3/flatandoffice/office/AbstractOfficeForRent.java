package jaknauczycsieprogramowania3.flatandoffice.office;

import jaknauczycsieprogramowania3.PropertyType;
import jaknauczycsieprogramowania3.flatandoffice.AbstractFlatAndOfficeForRent;

public abstract class AbstractOfficeForRent extends AbstractFlatAndOfficeForRent {

    private boolean isAllFloorInOfficeBudilding;

    public AbstractOfficeForRent(String nameOfAdvertisement, double size, String streetName, String postCode, String city, boolean isDirectAdvertisement, int volumeOfRooms, int level, int buildingNumber, int localNumber, boolean isBalcony) {
        super(nameOfAdvertisement, size, streetName, postCode, city, isDirectAdvertisement, volumeOfRooms, level, buildingNumber, localNumber, isBalcony);
    }

    public boolean isAllFloor() {
        return isAllFloorInOfficeBudilding;
    }


    @Override
    public PropertyType getType() {
        return PropertyType.OFFICE;
    }
}