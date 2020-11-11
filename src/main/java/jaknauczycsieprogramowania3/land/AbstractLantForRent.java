package jaknauczycsieprogramowania3.land;

import jaknauczycsieprogramowania3.AbstractPropertyForLeaving;
import jaknauczycsieprogramowania3.PropertyType;

public abstract class AbstractLantForRent extends AbstractPropertyForLeaving {

    private String landNumber;

    public AbstractLantForRent(String nameOfAdvertisement, double size, String streetName, String postCode, String city, boolean isDirectAdvertisement) {
        super(nameOfAdvertisement, size, streetName, postCode, city, isDirectAdvertisement);
    }


    @Override
    public PropertyType getType() {
        return PropertyType.LAND;
    }
}
