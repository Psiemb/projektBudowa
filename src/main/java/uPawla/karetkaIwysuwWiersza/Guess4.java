package uPawla.karetkaIwysuwWiersza;

public class Guess4 {
    public static void main(String[] args)
        throws java.io.IOException{

        char ch, ignore, answer ='K';

        do{
            System.out.println("Pomyslałem literę z przedziału A do Z.");
            System.out.println("Spróbuj ją odgadnąć: ");
            ch =(char) System.in.read();

           do{
                ignore =(char) System.in.read();
            } while (ignore != '\n');

            if (ch ==answer) System.out.println("**Dobrze! **");
            else {
                System.out.println("...NIestety trafiłeś");
                if(ch < answer) System.out.println("zbyt nisko");
                else System.out.println("za wysoko");
                System.out.println("Spróbuj jeszcze raz! \n");
            }

        } while (answer != ch);

    }
}
