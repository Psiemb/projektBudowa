package constructionEquipmentBase.equipmentBase.renting.constructionFormwork.ankry;

public class threadedRod {
    private int length;
    private String material;

    public threadedRod(int length, String material) {
        this.length = length;
        this.material = material;
    }

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
}
