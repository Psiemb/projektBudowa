package metody.ksiazkajavaoracle;

public class InchToMeterTable {
    public static void main(String[] args) {
        double inchs, meters;
        int counter;
        counter = 0;
        for (inchs = 1; inchs <=12*12; inchs++){
            meters = inchs * 39.37; //Zamiana na metry
            System.out.println(inchs + " cali to " +meters +" metrów.");

            counter++;

            // W co dwunastym wierszu wyświetlamy pusty wiersz (odstęp)

            if (counter == 12) {
                System.out.println();
                counter = 0; //Zeruje licznik wierszy
            }

        }


    }
}
