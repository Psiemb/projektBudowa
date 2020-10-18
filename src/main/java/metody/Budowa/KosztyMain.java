package metody.Budowa;

public class KosztyMain {

    public static void main(String[] args) {

        int wyplaty = 1212;
        int podatki = 33333;
        int materialy = 565656;
        KierownikBudowy kierownikBudowy = new KierownikBudowy();

        double koszty = kierownikBudowy.obliczKoszty(wyplaty, materialy, podatki);

        Koszt aktualneKoszty = new Koszt(wyplaty, podatki, materialy);
        double kosztyObiektowe = kierownikBudowy.obliczKoszty(aktualneKoszty);

        System.out.println("Koszty budowy wynosza: " + koszty + " obiiczone z double");
        System.out.println("Koszty budowy wynosza: " + kosztyObiektowe + " obliczone z obiektu");


//        System.out.println("Wyplaty = " + koszt.getWyplaty());

//        System.out.println("Wyplaty = " + koszt.getWyplaty());

//        System.out.println("Wyplaty = " + koszt.getWyplaty());


    }

}
