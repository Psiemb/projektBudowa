package constructionEquipmentBase.equipmentBase.renting.constructionFormwork.blatySzalunkowe;


public class FormworkShied {

    private String shutteringPlywood;

    private int dlugosc;
    private int szerokosc;

    public FormworkShied(String shutteringPlywood, int dlugosc, int szerokosc) {
        this.shutteringPlywood = shutteringPlywood;
        this.dlugosc = dlugosc;
        this.szerokosc = szerokosc;
    }

    public String getShutteringPlywood() {
        return shutteringPlywood;
    }

    public void setShutteringPlywood(String shutteringPlywood) {
        this.shutteringPlywood = shutteringPlywood;
    }

    public int getDlugosc() {
        return dlugosc;
    }

    public void setDlugosc(int dlugosc) {
        this.dlugosc = dlugosc;
    }

    public int getSzerokosc() {
        return szerokosc;
    }

    public void setSzerokosc(int szerokosc) {
        this.szerokosc = szerokosc;
    }

    @Override
    public String toString() {
        return "FormworkShied{" +
                "shutteringPlywood='" + shutteringPlywood + '\'' +
                ", dlugosc=" + dlugosc +
                ", szerokosc=" + szerokosc +
                '}';
    }
}
