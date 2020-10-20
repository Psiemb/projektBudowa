package constructionEquipmentBase.constructionSite;

public class Address {

    private String postCode;
    //TODO: townName -> city + gettery i settery
    private String townName;
    //TODO: streetName -> street + gettery i settery
    private String streetName;
    //TODO: buildingPlotNumber ?
    private String buildingPlot;

    public Address() {
    }

    //TODO: usunąć nieużywany konstruktor
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

    //TODO: toString
}
