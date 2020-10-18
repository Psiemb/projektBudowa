package constructionEquipmentBase.constructionSite;

public class SiteManager {

    private String firstName = "Andrzej";
    private String lastName = "Moryc";
    private String position;

    public SiteManager() {
    }

//    public KierownictwoBudowy(String nazwisko) {
//        this.nazwisko = nazwisko;
//    }
    public SiteManager(String firstName, String lastName, String position) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }


}
