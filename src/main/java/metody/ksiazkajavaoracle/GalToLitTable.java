package metody.ksiazkajavaoracle;

public class GalToLitTable {
    public static void main(String[] args) {
        double gallons, liters;
        int counter;
        counter = 0;
        for (gallons = 1; gallons <=100; gallons++){
            liters = gallons * 3.7854; //Zamiana na litry
                        System.out.println(gallons + " galonów to " +liters +" litrów.");

            counter++;

            // W co dziesiątym wierszu wyświetlamy pusty wiersz (odstęp)

            if (counter == 10) {
                System.out.println();
                counter = 0; //Zeruje licznik wierszy
            }

        }


    }
}
