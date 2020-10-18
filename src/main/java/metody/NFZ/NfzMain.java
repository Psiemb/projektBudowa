package metody.NFZ;

public class NfzMain {
    public static void main(String[] args) {
        Pacjent pacjent = new Pacjent(1.73,93.0);
        Lekarz lekarz = new Lekarz();

        pacjent.przytyj(-78);

        System.out.println("Pierwotna waga pacjenta wynosiła: " + pacjent.getWaga());
        lekarz.obliczIUstawBmi(pacjent);
        System.out.println("Przy wzroście pacjenta jego BMI wynosiło: " + pacjent.getWspolczynnikBmi());
//        pacjent.przytyj(3);
        System.out.println("Pacjent przytył, aktulana waga pacjenta wynosi: " + pacjent.getWaga());
        lekarz.obliczIUstawBmi(pacjent);
        System.out.println();
        System.out.println(lekarz.klasyfikacjaBMI(pacjent));

        pacjent.schudnij(7);
        System.out.println("Pacjent schudł, aktulana waga pacjenta wynosi: " + pacjent.getWaga());
        lekarz.obliczIUstawBmi(pacjent);
        System.out.println();
        System.out.println(lekarz.klasyfikacjaBMI(pacjent));

        /////////////////////////////

        double bmiPacjenta = lekarz.obliczBmi(pacjent);
        pacjent.setWspolczynnikBmi(bmiPacjenta);

        Pacjent durgiPacjent = new Pacjent(56, 66);

    }
}
