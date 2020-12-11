package jaknauczycsieprogramowania2.flat.smallFlat;

import jaknauczycsieprogramowania2.flat.AbstractFlat;
import jaknauczycsieprogramowania2.flat.FlatType;

public abstract class AbstractSmallFlat extends AbstractFlat {

    public AbstractSmallFlat(String adress, double size, double charges, String name) {
        super(adress, size, charges, name);
    }

    @Override
    public FlatType getType() {
        return FlatType.SMALL;
    }
}
