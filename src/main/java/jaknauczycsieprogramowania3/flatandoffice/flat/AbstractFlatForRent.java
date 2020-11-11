package jaknauczycsieprogramowania3.flatandoffice.flat;

import jaknauczycsieprogramowania3.PropertyType;
import jaknauczycsieprogramowania3.flatandoffice.AbstractFlatAndOfficeForRent;

public abstract class AbstractFlatForRent extends AbstractFlatAndOfficeForRent {

    private boolean isStorageRoomIncluded;

    public AbstractFlatForRent(String nameOfAdvertisement, double size, String streetName, String postCode, String city, boolean isDirectAdvertisement, int volumeOfRooms, int level, int buildingNumber, int localNumber, boolean isBalcony) {
        super(nameOfAdvertisement, size, streetName, postCode, city, isDirectAdvertisement, volumeOfRooms, level, buildingNumber, localNumber, isBalcony);
    }

    public boolean isStorageRoomIncluded() {
        return isStorageRoomIncluded;
    }

    @Override
    public PropertyType getType() {
        return PropertyType.FLAT;
    }
}
