package interfejsy.budowaFinanseTT.dokumentTT;

import interfejsy.budowaFinanseTT.DokumentFinansowyTT;

public class KaraTT implements DokumentFinansowyTT {

    private TypDokumentuTT typTT;
    private double wartoscTT;
    private String ktoNalozylTT;

    public KaraTT(TypDokumentuTT typTT, double wartoscTT, String ktoNalozylTT) {
        this.typTT = typTT;
        this.wartoscTT = wartoscTT;
        this.ktoNalozylTT = ktoNalozylTT;
    }

    @Override
    public TypDokumentuTT getTypTT() {
        return typTT;
    }

    public void setTypTT(TypDokumentuTT typTT) {
        this.typTT = typTT;
    }

    @Override
    public double getWatoscTT() {
        return wartoscTT;
    }

    public void setWartoscTT(double wartoscTT) {
        this.wartoscTT = wartoscTT;
    }

    public String getKtoNalozylTT() {
        return ktoNalozylTT;
    }

    public void setKtoNalozylTT(String ktoNalozylTT) {
        this.ktoNalozylTT = ktoNalozylTT;
    }

    @Override
    public String toString() {
        return "KaraTT{" +
                "typTT=" + typTT +
                ", wartoscTT=" + wartoscTT +
                ", ktoNalozylTT='" + ktoNalozylTT + '\'' +
                '}';
    }
}
