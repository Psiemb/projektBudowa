package metody.Trip;

public class Kasownikk {
    public void kasujBilet(Bilett biletSkasuj) {
        biletSkasuj.setSkasowany(true);
        // System.out.println("Bilet został skasowany");
    }
    //Chciałbym aby jeżeli Kanarr mówi, że skasowany to na kasowniku wychodzi
    //napis " :) "
     public String okno(Kanarr d, Bilett bill) {
         if (d.checkBilet(bill).equals("Bilet jest ok")) {
             System.out.println(" :) ");

             return "tak";
         }
         else {
             return " :( ";
         }
     }
    public String okno2(Kanarr d, Bilett bill) {
        if (d.checkBilet2(bill)) {
            System.out.println(" :) ");

            return "tak";
        }
        else {
            return " :( ";
        }
    }

}

