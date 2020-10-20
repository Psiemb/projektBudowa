package constructionEquipmentBase.constructionSite;

public class SiteManager {

    //TODO: lepiej nie przypisywać na sztywno wartości 'Andrzej' i 'Moryc'
    //TODO: zmień na zrobienie dobrze - czyli konstruktorem albo setterami
    private String firstName = "Andrzej";
    private String lastName = "Moryc";
    private String position;

    public SiteManager() {
    }

    //TODO: usunąć zakomentowany kod
//    public KierownictwoBudowy(String nazwisko) {
//        this.nazwisko = nazwisko;
//    }

    //TODO: usunąć nieużywany konstruktor
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

    //TODO: toString

}
