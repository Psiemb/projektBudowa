package metody.Trip;

public class Kanarr {
    public int i = 1;
    public String checkBilet(Bilett biletCheck){
        if (biletCheck.isSkasowany()){
            return "Bilet jest ok";
        }
        else {
            return "Bilet nie jest skasowany - kara 100 zl";}
    }
    public boolean checkBilet2(Bilett biletCheck){
        if (biletCheck.isSkasowany()){
            return true;
        }
        else {
            return false;
        }
    }

}
