package constructionEquipmentBase;

import constructionEquipmentBase.constructionSite.ConstructionSite;
import constructionEquipmentBase.accountant.Accountant;
import constructionEquipmentBase.util.InformationDisplay;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Na poczatku tworzymy wszystkie obiekty, które potrzebujemy na starcie
        Scanner scanner = new Scanner(System.in);
        InformationDisplay display = new InformationDisplay();
        ConstructionSite constructionSite = new ConstructionSite(); // = new BudowaBis("Wiosenna", "31-366", "Krakow", "wiosenna", "221", "Molik");
        Accountant accountant = new Accountant();
        //   double aktulneKosztyKwartalne;

//        System.out.println(constructionSite);

        //////////////////
        int currentChoice = 0;


        System.out.println("Witamy w programie budowlanym. Co chesz zrobic? Wybierz:");
        System.out.println("1 - Zakoncz");
        System.out.println("2 - Stwórz budowę");
        System.out.println("3 - Zmień nazwisko kierownika budowy");
        System.out.println("4 - Wypisz informacje o budowie");
        System.out.println("5 - podaj liczbę nowych pracowników");
        System.out.println("6 - Podaj liczbę praocwników do zwolnienia");
        System.out.println("7 - Ustaw średnią stawkę budowlańca");
        System.out.println("8 - Wybierz jeśli chcesz poznać aktualne koszty budowy.");
        System.out.println("9 - Przeglądnij dokumenty finansowe, tj. faktury i listy płac za wybrany miesiąc.");
        while (currentChoice != 1) {
            System.out.println("Co robimy dalej?");
            currentChoice = scanner.nextInt();

            if (currentChoice == 2) {
                constructionSite = new ConstructionSite("Wola Justowska", "31-366", "Krakow", "Wiosenna", "221","Janusz", "Molik");
//                System.out.println("Podaj nazwę budowy");
//                String nazwaBudowy = scanner.next();
//                System.out.println("Podaj kod pocztowy miejscowości.");
//                String kodPocztowy = scanner.next();
//                System.out.println("Podaj miejscowość w której będzie budowaBis.");
//                String nazwaMiejscowosci = scanner.next();
//                System.out.println("Podaj nazwę ulicy na której będzie budowaBis.");
//                String nazwaUlicy = scanner.next();
//                System.out.println("Podaj numery działek na jakich będzie budowaBis.");
//                String nrDzialek = scanner.next();
//                System.out.println("Podaj nazwisko kierowniwka");
//                String nazwiskoKierownika = scanner.next();
//                budowaBis = new Budowa(nazwaBudowy, kodPocztowy, nazwaMiejscowosci, nazwaUlicy, nrDzialek, nazwiskoKierownika);

            }
            if (currentChoice == 3) {
                System.out.println("Zmień nazwisko i imię kierownika budowy\nPodaj nazwisko nowego kierownika budowy");
                String changeSiteManagerLastName = scanner.next();
                constructionSite.getSiteManager().setLastName(changeSiteManagerLastName);
                System.out.println("Podaj imię nowego kierownika budowy");
                String changeSiteMagerFirtsName = scanner.next();
                constructionSite.getSiteManager().setFirstName(changeSiteMagerFirtsName);
//                    budowaBis.setNazwiskoKierownika(changeSiteManagerLastName);

            }
            if (currentChoice == 4) {
                display.displayConstructionSiteInformation(constructionSite);
            }
            if (currentChoice == 5) {
                System.out.println("Podaj liczbę nowych pracowników:");
                int newEmpolyee = scanner.nextInt();
                constructionSite.getPersonalFinances().hireAnEmployee(newEmpolyee);
            }
            if (currentChoice == 6) {
                System.out.println("Podaj liczbę praocwników do zwolnienia");
                int dismissEmployee = scanner.nextInt();
                constructionSite.getPersonalFinances().dismissAnEmployee(dismissEmployee);
            }
            if (currentChoice == 7) {
                System.out.println("Ustaw średnią stawkę budowlańca");
                double avergeConstructionWorkerSalaryScanner = scanner.nextDouble();
                constructionSite.getPersonalFinances().setCurrentEmployeeSalary(avergeConstructionWorkerSalaryScanner);
                System.out.println(constructionSite.getPersonalFinances().getCurrentEmployeeSalary());
            }
            if (currentChoice == 8) {
                System.out.println("Wybierz jeśli chcesz poznać aktualne koszty budowy.");
                accountant.calculateQuarterlyCosts(constructionSite);
            }
            if (currentChoice == 9) {
                System.out.println("Przeglądnij dokumenty finansowe, tj. faktury i listy płac za wybrany miesiąc");
                constructionSite.getCostDocuments().getInvoice();
                constructionSite.getCostDocuments().getPayrollList();
            }
        }
        System.out.println("No to konczymy. Papa");
    }
}
