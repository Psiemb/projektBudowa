package metody.ksiazkajavaoracle;

/*
   Ostateczna wersja systemu pomocy
   obs�uguj�ca wielokrotny wyb�r
*/
class Help3 {
  public static void main(String args[])
    throws java.io.IOException {
    char choice, ignore;
    for(;;) {
      do {
        System.out.println("Informacje na temat sk�adni instrukcji:");
        System.out.println("  1. if");
        System.out.println("  2. switch");
        System.out.println("  3. for");
        System.out.println("  4. while");
        System.out.println("  5. do-while");
        System.out.println("  6. break");
        System.out.println("  7. continue\n");
        System.out.print("Wybierz numer instrukcji (lub q aby zako�czy�): ");

        choice = (char) System.in.read();
  
        do {
          ignore = (char) System.in.read();
        } while(ignore != '\n');
      } while( choice < '1' | choice > '7' & choice != 'q');
      if(choice == 'q') break;
      System.out.println("\n");
        switch (choice) {
        case '1':
          System.out.println("Instrukcja warunkowa if:\n");
          System.out.println("if(warunek) instrukcja;");
          System.out.println("else instrukcja;");
          break;
        case '2':
          System.out.println("Instrukcja wyboru switch:\n");
          System.out.println("switch(wyra�enie) {");
          System.out.println("  case sta�a:");
          System.out.println("    sekwencja instrukcji");
          System.out.println("    break;");
          System.out.println("  // ...");
          System.out.println("}");
          break;
        case '3':
          System.out.println("P�tla for:\n");
          System.out.print("for(inicjalizacja; warunek; iteracja)");
          System.out.println(" instrukcja;");
          break;
        case '4':
          System.out.println("P�tla while:\n");
          System.out.println("while(warunek) instrukcja;");
          break;
        case '5':
          System.out.println("P�tla do-while:\n");
          System.out.println("do {");
          System.out.println("  instrukcja;");
          System.out.println("} while (warunek);");
          break;
        case '6':
          System.out.println("Instrukcja break:\n");
          System.out.println("break; lub break etykieta;");
          break;
        case '7':
          System.out.println("Instrukcja continue:\n");
          System.out.println("continue; lub continue etykieta;");
          break;
      }
      System.out.println();
    }
  }
}
