package jaknauczycsieprogramowania2.flat.smallFlat;

public class SmallFlat extends AbstractSmallFlat {

    public SmallFlat(String adress, double size, double charges, String name) {
        super(adress, size, charges, name);
    }
    private void showSmallFlat(){
        System.out.println("Pokaz małe mieszkanie");
    }
}
