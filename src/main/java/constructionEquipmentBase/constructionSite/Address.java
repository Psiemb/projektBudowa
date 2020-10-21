package constructionEquipmentBase.constructionSite;

public class Address {

    private String postCode;
    private String city;
    private String street;
    private String buildingPlotNumber;

    public Address() {
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getBuildingPlotNumber() {
        return buildingPlotNumber;
    }

    public void setBuildingPlotNumber(String buildingPlotNumber) {
        this.buildingPlotNumber = buildingPlotNumber;
    }

    @Override
    public String toString() {
        return "Address{" +
                "postCode='" + postCode + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", buildingPlotNumber='" + buildingPlotNumber + '\'' +
                '}';
    }
}
