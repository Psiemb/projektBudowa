package constructionEquipmentBase.accountant;

import constructionEquipmentBase.constructionSite.ConstructionSite;
import constructionEquipmentBase.constructionSite.PersonalFinances;
import java.util.Objects;

public class Accountant {

    public double calculateQuarterlyCosts(ConstructionSite constructionSite) {
        if (Objects.isNull(constructionSite) || constructionSite.getPersonalFinances().getCurrentEmployeeSalary() < 0 || constructionSite.getPersonalFinances().getCurrentPersonalStatus() < 0) {
            System.out.println(" Nie zatrudniono pracownika lub obecna średnia stawka budowlańca nie może być liczba ujemną ");
            return 0.0;
        } else {
            double currentQuarterlyCost;

            currentQuarterlyCost = constructionSite.getPersonalFinances().getCurrentPersonalStatus() *
                    constructionSite.getPersonalFinances().getCurrentEmployeeSalary() * 3;
            System.out.println("Obecny stan osobowy wg księgowej: " + constructionSite.getPersonalFinances().getCurrentPersonalStatus() + " osób");
            System.out.println("Aktualna stawka wynagrodzenia wg księgowej: " + constructionSite.getPersonalFinances().getCurrentEmployeeSalary() + " zł");
            System.out.println("Kwartalne koszty wynosza: " + currentQuarterlyCost + " zł.");

            return currentQuarterlyCost;
        }

    }

    public void calculateQuarterlyCosts22222(PersonalFinances personalFinances) {
        if (Objects.isNull(personalFinances) || incorrectData(personalFinances)) {
            System.out.println(" Nie zatrudniono pracownika lub obecna średnia stawka budowlańca nie może być liczba ujemną ");
            return;
        }

        double currentQuarterlyCost;

        currentQuarterlyCost = personalFinances.getCurrentPersonalStatus() *
                personalFinances.getCurrentEmployeeSalary() * 3;
        System.out.println("Obecny stan osobowy wg księgowej: " + personalFinances.getCurrentPersonalStatus() + " osób");
        System.out.println("Aktualna stawka wynagrodzenia wg księgowej: " + personalFinances.getCurrentEmployeeSalary() + " zł");
        System.out.println("Kwartalne koszty wynosza: " + currentQuarterlyCost + " zł.");
    }

    private boolean incorrectData(PersonalFinances personalFinances) {
        return personalFinances.getCurrentEmployeeSalary() < 0 || personalFinances.getCurrentPersonalStatus() < 0;
    }
}
