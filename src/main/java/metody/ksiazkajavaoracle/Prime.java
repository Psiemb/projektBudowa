package metody.ksiazkajavaoracle;

public class Prime {

    public static void main(String[] args) {
        int i, j;
        boolean isprime;

        for (i = 2; i < 100; i++) {
            isprime = true;

            //Sprawdza czy liczb dzieli się bez reszty
            for (j = 2; j <= i / j; j++)
                //Jeśli tak to nie jest liczba pierwszą
                if ((i % j) == 0) isprime = false;

            if (isprime)
                System.out.println(i + "jest liczbą pierwsz.");


        }

    }
}
