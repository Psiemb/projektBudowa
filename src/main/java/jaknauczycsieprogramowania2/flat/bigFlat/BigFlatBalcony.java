package jaknauczycsieprogramowania2.flat.bigFlat;

public class BigFlatBalcony extends AbstractBigFlat{

    private boolean over2Rooms;

    public BigFlatBalcony(String adress, double size, double charges, String name, String hasBalcony, boolean over2Rooms) {
        super(adress, size, charges, name, hasBalcony);
        this.over2Rooms = over2Rooms;
    }

    public boolean isOver2Rooms() {
        return over2Rooms;
    }
    @Override
    public void buy() {
        System.out.println("Mieszkanie do zakupu. Do przemyślenia.");
    }

    @Override
    public String toString() {
        return "BigFlatBalcony{" +
                "over2Rooms=" + over2Rooms +
                ", hasBalcony='" + hasBalcony + '\'' +
                ", adress='" + adress + '\'' +
                ", size=" + size +
                ", charges=" + charges +
                ", name='" + name + '\'' +
                '}';
    }
}
