package jaknauczycsieprogramowania2.flat.bigFlat;

import jaknauczycsieprogramowania2.flat.AbstractFlat;
import jaknauczycsieprogramowania2.flat.FlatType;

public abstract class AbstractBigFlat extends AbstractFlat implements BigFlatBuy{
    protected String hasBalcony;

    public AbstractBigFlat(String adress, double size, double charges, String name, String hasBalcony) {
        super(adress, size, charges, name);
        this.hasBalcony = hasBalcony;
    }

    @Override
    public FlatType getType() {
        return FlatType.BIG;
    }


}
