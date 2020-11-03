package tasks.third;

import tasks.third.figury.Kwadrat;
import tasks.third.figury.Kolo;
import tasks.third.figury.TrapezRownoramienny;
import tasks.third.figury.TrojkatProstokatny;

import java.util.ArrayList;
import java.util.List;

public class FiguryMain {
    public static void main(String[] args) {

        List<FiguryPlaskie> figuryPlaskies = new ArrayList<>();


        Kwadrat kwadrat = new Kwadrat(23);
        TrojkatProstokatny trojkatProstokatny = new TrojkatProstokatny(20,34);
        Kolo kolo = new Kolo(57);
        TrapezRownoramienny trapezRownoramienny = new TrapezRownoramienny(43,23,21);

        figuryPlaskies.add(trojkatProstokatny);
        figuryPlaskies.add(kwadrat);
        figuryPlaskies.add(kolo);
        figuryPlaskies.add(trapezRownoramienny);

        System.out.println(figuryPlaskies);

        trojkatProstokatny.pole();
        trojkatProstokatny.obwod();
        kwadrat.pole();
        kwadrat.obwod();
        kolo.pole();
        kolo.obwod();
        trapezRownoramienny.pole();
        trapezRownoramienny.obwod();

    }
}
