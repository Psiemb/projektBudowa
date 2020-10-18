package metody.ksiazkajavaoracle;

class AddMeth {
    public static void main(String args[]) {
        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();

       // int range1, range2;

        // Przypisuje wartości składowym obiektu minivan
        minivan.passengers = 7;
        minivan.fuelcap = 65;
        minivan.lkm = 9.1;

        // Przypisuje wartości składowym obiektu sportscar
        sportscar.passengers = 2;
        sportscar.fuelcap = 55;
        sportscar.lkm = 12.5;


        System.out.print("Minivan przewozi " + minivan.passengers +
                " osób. ");

        minivan.range(); // Wyświetla zasięg pojazdu minivan

        System.out.print("Auto sportowe przewozi " + sportscar.passengers +
                " osoby. ");

        sportscar.range(); // Wyświetla zasięg pojazdu sportscar
    }
}

