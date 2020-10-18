package dzienPierwszy;

public class CzlowiekMain {
//psvm
    public static void main(String[] args) {

        Czlowiek pawel = new Czlowiek();
        pawel.imie = "ASF@#$R#$RT#GDFAsdf23453453fada@#$%@%";

        Czlowiek piotr = new Czlowiek();
        piotr.imie = "Piotr";

        //sout
//        System.out.println(pawel.imie);
//        System.out.println(piotr.imie);

        String wynik2 = pawel.przedstawSie();
        System.out.println(piotr.przedstawSie());
        System.out.println(wynik2);


        int suma = pawel.dodaj(2, 5);
        System.out.println(suma);


    }

}
