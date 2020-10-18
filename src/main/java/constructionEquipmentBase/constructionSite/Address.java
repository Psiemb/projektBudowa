package constructionEquipmentBase.constructionSite;

public class Address {

    private String postCode;
    private String townName;
    private String streetName;
    private String buildingPlot;

    public Address() {
    }

    public Address(String postCode, String townName, String streetName, String buildingPlot) {
        this.postCode = postCode;
        this.townName = townName;
        this.streetName = streetName;
        this.buildingPlot = buildingPlot;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getTownName() {
        return townName;
    }

    public void setTownName(String townName) {
        this.townName = townName;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getBuildingPlot() {
        return buildingPlot;
    }

    public void setBuildingPlot(String buildingPlot) {
        this.buildingPlot = buildingPlot;
    }
}
