package metody.ksiazkajavaoracle;

public class CompFuel {
    public static void main(String[] args) {

        Vehicle minivan = new Vehicle();
        Vehicle sportscar =new Vehicle();
        int dist = 252;

        // Przypisuje wartości składowym obiektu minivan
        minivan.passengers = 7;
        minivan.fuelcap = 65;
        minivan.lkm = 9.1;

        // Przypisuje wartości składowym obiektu sportscar
        sportscar.passengers = 2;
        sportscar.fuelcap = 55;
        sportscar.lkm = 12.5;

        System.out.println("Aby przejechać " +dist + " kilometrów, minivan potrzebuje " + minivan.fuelneeded((dist)) + " litrów paliwa");

        System.out.println("Aby przejechać " +dist + " kilometrów, sportscar potrzebuje " + sportscar.fuelneeded((dist)) + " litrów paliwa");
    }
}
