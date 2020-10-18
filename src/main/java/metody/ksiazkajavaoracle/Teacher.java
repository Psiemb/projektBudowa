package metody.ksiazkajavaoracle;

public class Teacher {
    public boolean IsPrime (int number){
        if (number == 1){
            return false;
        }
        return true;
    }
    public boolean isGreaterThenZero (int number){
        if (number > 0 ) {
            return true;

        }

        return false;

    }
    public int equalEven (int number){
        if (number % 2 == 0 ){
            return number;
        }
        return 0;
    }
    public boolean isPrimeInt (int number){
        int i, j;
        boolean isprime2 = true;


            //Sprawdza czy liczb dzieli się bez reszty
            for (j = 2; j <= number / j; j++) {
                //Jeśli tak to nie jest liczba pierwszą
                if ((number % j) == 0) isprime2 = false;

                else return true;
            }

       return false;
    }

}
