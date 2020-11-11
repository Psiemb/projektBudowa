package jaknauczycsieprogramowania3.flatandoffice;

import jaknauczycsieprogramowania3.AbstractPropertyForLeaving;

public abstract class AbstractFlatAndOfficeForRent extends AbstractPropertyForLeaving {
    private int volumeOfRooms;
    private int level;
    private int buildingNumber;
    private  int localNumber;
    private boolean isBalcony;

    public AbstractFlatAndOfficeForRent(String nameOfAdvertisement, double size, String streetName, String postCode, String city, boolean isDirectAdvertisement, int volumeOfRooms, int level, int buildingNumber, int localNumber, boolean isBalcony) {
        super(nameOfAdvertisement, size, streetName, postCode, city, isDirectAdvertisement);
        this.volumeOfRooms = volumeOfRooms;
        this.level = level;
        this.buildingNumber = buildingNumber;
        this.localNumber = localNumber;
        this.isBalcony = isBalcony;
    }

    public int getVolumeOfRooms() {
        return volumeOfRooms;
    }

    public int getLevel() {
        return level;
    }

    public int getBuildingNumber() {
        return buildingNumber;
    }

    public int getLocalNumber() {
        return localNumber;
    }

    public boolean isBalcony() {
        return isBalcony;
    }
}
