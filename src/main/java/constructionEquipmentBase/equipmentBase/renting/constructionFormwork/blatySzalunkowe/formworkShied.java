package constructionEquipmentBase.equipmentBase.renting.constructionFormwork.blatySzalunkowe;

public class formworkShied {
    private String shutteringPlywood;
    private int sizeA;
    private int sizeB;

    public formworkShied(String shutteringPlywood, int sizeA, int sizeB) {
        this.shutteringPlywood = shutteringPlywood;
        this.sizeA = sizeA;
        this.sizeB = sizeB;
    }

    public String getShutteringPlywood() {
        return shutteringPlywood;
    }

    public void setShutteringPlywood(String shutteringPlywood) {
        this.shutteringPlywood = shutteringPlywood;
    }

    public int getSizeA() {
        return sizeA;
    }

    public void setSizeA(int sizeA) {
        this.sizeA = sizeA;
    }

    public int getSizeB() {
        return sizeB;
    }

    public void setSizeB(int sizeB) {
        this.sizeB = sizeB;
    }
}
