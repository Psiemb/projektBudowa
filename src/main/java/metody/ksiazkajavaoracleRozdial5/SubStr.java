package metody.ksiazkajavaoracleRozdial5;

// Użycie metody substring()
class SubStr {  
  public static void main(String args[]) {  
    String orgstr = "Java napędza sieć Web"; 
 
    // Tworzy podłańcuch
    String substr = orgstr.substring(5, 17);

    System.out.println("orgstr: " + orgstr); 
    System.out.println("substr: " + substr);

/*
    int i;
    int sum = 0;
    for (i = 1; i <= 5; sum += i++ );

    System.out.println("\n\nSuma wynosi " +sum);
*/
    int i;
    int sum = 0;
    for (i = 1; i <= 5; i++ )

    sum = sum +i;
    System.out.println("\n\nSuma wynosi " +sum);
  }  
}
