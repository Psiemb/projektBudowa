package metody.ksiazkajavaoracle;

// Przyk�ad u�ycia continue
class ContDemo {
  public static void main(String args[]) {
    int i; 
 /*
    // Wy�wietla liczby parzyste z przedzia�u od 0 do 100 
    for(i = 0; i<=100; i++) {  
      if((i%2) == 0) continue; // Iteracja
      System.out.println(i);



    }*/
    Vi cw = new Vi();
    cw.myMeth();
  }
}
class Vi{
  void myMeth () {
    int i;
    for (i = 0; i < 10; i++) {
      if (i == 5) return;
      System.out.println(i);
    }
  }
}