package metody.ksiazkajavaoracle;

public class ForVar {
    public static void main(String[] args) {
        int sum = 0;
        int fact = 1;
        int i;
        //Wyznacza silnię liczby 5
        for (i = 1; i <= 5; i++){
            sum += i; //sum = sum + i;
            fact *= i; // fact = fact * i;
            System.out.println(i +" " +sum +" " +fact);

        }
        System.out.println("Po zakończeniu pętli , dzięki deklaracji zmiennej przed pętlą i wynosi: " +i);
        System.out.println("Suma wynosi " + sum );
        System.out.println("Silnia wynosi " + fact);
    }
}
