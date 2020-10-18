package metody.ksiazkajavaoracle;

public class TeacherMain {
    public static void main(String[] args) {

        Teacher einstein = new Teacher();

        boolean result = einstein.IsPrime(2);
        if (result) System.out.println(result+ " Liczba pierwsza");

        boolean result2 = einstein.isGreaterThenZero(5);
        System.out.println(result2);

        int result3 = einstein.equalEven(5);
        System.out.println(result3);

        boolean result4 = einstein.isPrimeInt(5);
        System.out.println( result4+ " to liczba pierwsza");



    }
}

