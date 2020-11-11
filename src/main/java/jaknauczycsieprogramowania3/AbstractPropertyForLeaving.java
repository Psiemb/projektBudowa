package jaknauczycsieprogramowania3;

public abstract class AbstractPropertyForLeaving implements Property{

    private String nameOfAdvertisement;
    private double size;
    private String streetName;
    private String postCode;
    private String city;
    private boolean isDirectAdvertisement;

    public AbstractPropertyForLeaving(String nameOfAdvertisement, double size, String streetName, String postCode, String city, boolean isDirectAdvertisement) {
        this.nameOfAdvertisement = nameOfAdvertisement;
        this.size = size;
        this.streetName = streetName;
        this.postCode = postCode;
        this.city = city;
        this.isDirectAdvertisement = isDirectAdvertisement;
    }

    @Override
    public String getNameOfAdvertisement() {
        return this.nameOfAdvertisement;
    }

    @Override
    public double getSize() {
        return this.size;
    }

    @Override
    public String getStreetName() {
        return this.streetName;
    }

    @Override
    public String getPostCode() {
        return this.postCode;
    }

    @Override
    public String getCity() {
        return this.city;
    }

    @Override
    public boolean getIsDirectAdvertisement() {
        return this.isDirectAdvertisement;
    }

}
