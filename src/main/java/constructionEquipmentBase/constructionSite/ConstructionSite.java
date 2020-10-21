package constructionEquipmentBase.constructionSite;

public class ConstructionSite {

    private String name;
    private CostDocuments costDocuments = new CostDocuments();
    private SiteManager siteManager = new SiteManager();
    private Address address = new Address();
    private PersonalFinances personalFinances = new PersonalFinances();

    public ConstructionSite() {
    }

    public ConstructionSite(String name, String postCode, String city,
                            String ulica, String nrDzialek, String imieKierownika, String nazwiskoKierownika) {
        this.name = name;
        this.address.setPostCode(postCode);
        this.address.setCity(city);
        this.address.setStreet(ulica);
        this.address.setBuildingPlotNumber(nrDzialek);
        this.siteManager.setLastName(nazwiskoKierownika);
        this.siteManager.setFirstName(imieKierownika);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CostDocuments getCostDocuments() {
        return costDocuments;
    }

    public void setCostDocuments(CostDocuments costDocuments) {
        this.costDocuments = costDocuments;
    }

    public SiteManager getSiteManager() {
        return siteManager;
    }

    public void setSiteManager(SiteManager siteManager) {
        this.siteManager = siteManager;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public PersonalFinances getPersonalFinances() {
        return personalFinances;
    }

    public void setPersonalFinances(PersonalFinances personalFinances) {
        this.personalFinances = personalFinances;
    }

    @Override
    public String toString() {
        return "ConstructionSite{" +
                "name='" + name + '\'' +
                ", costDocuments=" + costDocuments +
                ", siteManager=" + siteManager +
                ", address=" + address +
                ", personalFinances=" + personalFinances +
                '}';
    }
}
