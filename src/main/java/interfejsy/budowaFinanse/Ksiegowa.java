package interfejsy.budowaFinanse;

import java.util.List;

public class Ksiegowa {

    public double oblicz(List<DokumentFinansowy> dokumentyFinansowe) {
        return dokumentyFinansowe.stream()
                .map(DokumentFinansowy::getWartosc)
                .reduce(0.0, Double::sum);
    }
}
