package uPawla.settery;

public class MainCzlowiek {

    public static void main(String[] args) {
        Czlowiek piotr = new Czlowiek();
        System.out.println(piotr.getKubekDoHerbaty());

        Kubek ikeaKubek = new Kubek("twertwertwerte35345f", 10.8);
        piotr.setKubekDoHerbaty(ikeaKubek);
        System.out.println(piotr.getKubekDoHerbaty());

    }
}
