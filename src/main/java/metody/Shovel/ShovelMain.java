package metody.Shovel;

import java.sql.SQLOutput;
import java.util.SortedMap;

public class ShovelMain {
    public static void main(String[] args) {
        Shovel sh = new Shovel();
        Robotnik rob = new Robotnik();

        System.out.println("Sprawdzamy czy łopata jest dobra, czy nie złamana: ");
        System.out.println(sh.isBroken());
        System.out.println("Jeżeli łopata złamana pracownik nie może wykonywać pracy");
        rob.breakShovel(sh);
        System.out.println(rob.breakShovel(sh));


    }
}
