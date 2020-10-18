package metody.ksiazkajavaoracle;

public class RIIIZad1 {
    public static void main(String[] args)
        throws java.io.IOException{

        char ch;
        int spaces = 0;

        System.out.println("Wpowadź kropkę, aby zakończyć.");
        do {
            ch =(char) System.in.read();
            if (ch == ' ') spaces++;

        } while (ch != '.');
        System.out.println("Liczba spacji wynosi: " +spaces);
    }
}
