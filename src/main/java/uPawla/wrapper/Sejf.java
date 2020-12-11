package uPawla.wrapper;

public class Sejf {

    private Telefon telefon;
    private int kod;

    public Sejf(int kod) {
        this.telefon = new Telefon();
        this.kod = kod;
    }

    public void zadzon(int kodOtwierajacySkrytke){
        if(kodOtwierajacySkrytke == kod) {
            this.telefon.dzwon();
        }
        else {
            System.out.println("Zly kod!!!");
        }
    }
}
