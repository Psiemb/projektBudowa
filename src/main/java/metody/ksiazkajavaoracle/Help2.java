package metody.ksiazkajavaoracle;

/*
    Ulepszony system pomocy wykorzystuj�cy p�tl�
    do-while do obs�ugi wyboru z menu
*/
class Help2 {
  public static void main(String args[])
    throws java.io.IOException {
    char choice, ignore;
    do {
      System.out.println("Informacje na temat sk�adni instrukcji:");
      System.out.println("  1. if");
      System.out.println("  2. switch");
      System.out.println("  3. for");
      System.out.println("  4. while");
      System.out.println("  5. do-while\n");
      System.out.print("Wybierz numer instrukcji: ");

      choice = (char) System.in.read();
      do {
        ignore = (char) System.in.read();
      } while(ignore != '\n');
    } while( choice < '1' | choice > '5');
    System.out.println("\n");
    switch(choice) {
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
    }
  }
}
