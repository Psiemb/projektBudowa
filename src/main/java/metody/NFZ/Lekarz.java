package metody.NFZ;

public class Lekarz {

    // PIERW POLA
    // POTEM KONSTRUKTOR
    // POTEM GETTERY I SETTER
    // POTEM PUBLICZNE METODY
    // POTEM PRYWATNE METODY

    //NAZWA METODY MA OPISYWAC CO ONA ROBI. MOZE BYC DLUGA
    //NAZWA PARAMETRU MA OPISYWAC CO TO ZA PARAMETR. ZADNYCH SKROTOW TYPU 'PAC'
    public void obliczIUstawBmi(Pacjent pacjent) {
        //WYCIAGNIECIE DANYCH, NA KTORYCH METODA ROBI JAKIES OBLICZENIA
        double wagaPacjenta = pacjent.getWaga();
        double wzrostPacjenta = pacjent.getWzrost();
        // TU PRZYPISANIE WYNIKU METODY TO ZMIENNEJ, KTORA LADNIE OPISUJE CZYM ONA JET
        double aktualneBmi = wagaPacjenta / (wzrostPacjenta * wzrostPacjenta);

        pacjent.setWspolczynnikBmi(aktualneBmi);
    }

    public double obliczBmi(Pacjent pacjent) {
        double wagaPacjenta = pacjent.getWaga();
        double wzrostPacjenta = pacjent.getWzrost();
        double aktualneBmi = wagaPacjenta / (wzrostPacjenta * wzrostPacjenta);

        return aktualneBmi;
    }

    public String klasyfikacjaBMI(Pacjent pacjent) {
        // GDY JAKAS WARTOSC UZYWAMY WIECEJ NIZ JEDEN RAZ, TO JA WYCIAGAMY DO ZMIENNEJ,
        // TA ZMIENNA POWINNA MIEC DOBRA, OPISOWA NAZWE
        double aktulanyWspolczynnikBmi = pacjent.getWspolczynnikBmi();

        if ((aktulanyWspolczynnikBmi > 18.5) && (aktulanyWspolczynnikBmi <= 25)) {
            return "Wartość BMI prawidłowa";
        }
        if ((aktulanyWspolczynnikBmi > 25.0) && (aktulanyWspolczynnikBmi <= 30)) {
            return "Wartość BMI nieprawidłowa -masz nadwagę";
        }
        if ((aktulanyWspolczynnikBmi > 30.0) && (aktulanyWspolczynnikBmi <= 35)) {
            return "Wartość BMI nieprawidłowa -masz I stopień otyłyści";
        }
        if ((aktulanyWspolczynnikBmi > 35.0) && (aktulanyWspolczynnikBmi <= 40)) {
            return "Wartość BMI nieprawidłowa -masz II stopień otyłyści";
        }

        return "Proszę się udac natychmiast do lekarza rodzinnego!";
    }

    // ALT + CTRL + L  <- FORMATOWANIE
    // ALT + CTRL + O <- USUWANIE NIEPOTRZEBNYCH IMPORTOW


}
