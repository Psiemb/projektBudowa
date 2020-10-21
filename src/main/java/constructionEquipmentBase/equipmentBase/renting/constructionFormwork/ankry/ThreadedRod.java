package constructionEquipmentBase.equipmentBase.renting.constructionFormwork.ankry;


public class ThreadedRod {

    private int length;
    private String material;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "ThreadedRod{" +
                "length=" + length +
                ", material='" + material + '\'' +
                '}';
    }

}
