package metody.ksiazkajavaoracle;

// Zgadywanka, wersja czwarta
class Guess4 {
  public static void main(String args[])
    throws java.io.IOException {
    char ch, ignore, answer = 'K';
    do {
      System.out.println("Pomyślałem sobie literę z przedziału od A do Z.");
      System.out.print("Spróbuj ją odgadnąć: ");

      // Wczytuje znak
      ch = (char) System.in.read();

      // Usuwa pozosta�e znaki z bufora wej�ciowego
      do {
        ignore = (char) System.in.read();
      } while(ignore != '\n');

      if(ch == answer) System.out.println("** Dobrze! **");
      else {
        System.out.print("...Niestety trafiłeś ");
        if(ch < answer) System.out.println("zbyt nisko");
        else System.out.println("za daleko");
        System.out.println("Spróbuj raz jeszcze!\n");
      }
    } while(answer != ch);
  }
}
