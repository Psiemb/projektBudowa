package metody.ksiazkajavaoracle;

public class Vehicle2 {
    int passengers; // :iczba pasażerów
    int fuelcap;    // Pojemność zbiornika paliwa w litrach
    double lkm;     // Zużycie paliwa w litrach na 100 kilometrów

    //Konstruktor klasy Vehicle2
    Vehicle2(int p, int f, double l){
        passengers = p;
        fuelcap = f;
        lkm =l;
    }

    // Zwraca zasięg.
    int range() {
        return (int) (fuelcap / lkm * 100);
    }
    //Oblicza paliwo potrzebne do przejeechania km kilometrów
    double fuelneeded (int km){
        return (double)  km / 100 * lkm ;

        // double fuelneeded (int km){
        //   return (double)  (km / 100 * lkm) ;
    }
}
