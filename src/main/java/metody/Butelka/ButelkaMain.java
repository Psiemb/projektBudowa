package metody.Butelka;

public class ButelkaMain {

    public static void main(String[] args) {
        Butelka[] butelka = new Butelka[3]; //NULL

        butelka[0] = new Butelka(9);
        butelka[1] = new Butelka(8);
        butelka[2] = new Butelka(10);

        butelka[1].przelej(15, butelka[2]);

        System.out.println(butelka[0].getIloscLitrow());
        System.out.println(butelka[1].getIloscLitrow());
        System.out.println(butelka[2].getIloscLitrow());

    }

}

