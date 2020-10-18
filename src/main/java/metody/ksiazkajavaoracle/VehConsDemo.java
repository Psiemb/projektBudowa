package metody.ksiazkajavaoracle;

public class VehConsDemo {
    public static void main(String[] args) {

        //Tworzymy obiekt Vehicle2
        Vehicle2 minivan = new Vehicle2(7, 65,9.1);
        Vehicle2 sportscar = new Vehicle2(2, 55,12.5);
        double liters;
        int dist = 25;

        liters = minivan.fuelneeded(dist);
        System.out.print("Aby przejechać " +dist + " kilometrów, minivan potrzebuje " + liters + " litrów paliwa.");
        System.out.println(" Minivan przejedzie na pełnym baku " + minivan.range()+ "km.");

        liters = sportscar.fuelneeded(dist);
        System.out.print("Aby przejechać " +dist + " kilometrów, sportscar potrzebuje " + liters + " litrów paliwa.");
        System.out.println(" Sportscar przejedzie na pełnym baku " + sportscar.range()+ "km.");

    }
}
