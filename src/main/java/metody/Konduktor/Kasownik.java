package metody.Konduktor;

public class Kasownik {
    public String skasujBilet(Bilet biletDoSkasowania){
        if(biletDoSkasowania.isSkasowany()) {
            return "BLAD";
        }
        else {
            biletDoSkasowania.setSkasowany(true);
            return "OK!";
        }
    }
}
