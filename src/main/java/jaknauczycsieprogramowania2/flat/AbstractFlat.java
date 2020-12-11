package jaknauczycsieprogramowania2.flat;

public abstract class AbstractFlat implements Flat{

    protected String adress;
    protected double size;
    protected double charges;
    protected String name;

    public AbstractFlat(String adress, double size, double charges, String name) {
        this.adress = adress;
        this.size = size;
        this.charges = charges;
        this.name = name;
    }

    @Override
    public String getAdress() {
        return this.adress;
    }

    @Override
    public double getSize() {
        return this.size;
    }

    @Override
    public double getCharges() {
        return this.charges;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
