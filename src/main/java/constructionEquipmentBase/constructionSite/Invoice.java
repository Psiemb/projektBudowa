package constructionEquipmentBase.constructionSite;

public class Invoice {

    private double value;
    private String dostawca = "Nasza Baza Sprzetu";

    public Invoice() {
    }

    public Invoice(String dostawca, double value) {
        this.dostawca = dostawca;
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getDostawca() {
        return dostawca;
    }

    public void setDostawca(String dostawca) {
        this.dostawca = dostawca;
    }
}
