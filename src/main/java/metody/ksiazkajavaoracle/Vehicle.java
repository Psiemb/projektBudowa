package metody.ksiazkajavaoracle;

class Vehicle {
    int passengers; // Liczba pasażerów
    int fuelcap;    // Pojemność zbiornika paliwa w litrach
    double lkm;     // Zużycie paliwa w litrach na 100 kilometrów


    // Zwraca zasięg.
    int range() {
       return (int) (fuelcap / lkm * 100);
    }

    double fuelneeded (int km){
        return (double)  km / 100 * lkm ;

       // double fuelneeded (int km){
         //   return (double)  (km / 100 * lkm) ;
    }
}

