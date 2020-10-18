package constructionEquipmentBase.constructionSite;

public class PersonalFinances {

    private int currentPersonalStatus = 5;
    private double currentEmployeeSalary = 3200;

    public PersonalFinances() {
    }

    public PersonalFinances(int currentPersonalStatus, double currentEmployeeSalary) {
        this.currentPersonalStatus = currentPersonalStatus;
        this.currentEmployeeSalary = currentEmployeeSalary;

    }

    public int getCurrentPersonalStatus() {
        return currentPersonalStatus;
    }

    public void setCurrentPersonalStatus(int currentPersonalStatus) {
        this.currentPersonalStatus = currentPersonalStatus;
    }

    public double getCurrentEmployeeSalary() {
        return currentEmployeeSalary;
    }

    public void setCurrentEmployeeSalary(double currentEmployeeSalary) {
        this.currentEmployeeSalary = currentEmployeeSalary;
    }

    public void hireAnEmployee(int qtyEmployeeToBeHired) {
        if (qtyEmployeeToBeHired < 0) {
            System.out.println("Nie możesz zatrudnić ujemnej liczby pracowników.");
            return;
        }
        if (qtyEmployeeToBeHired > 100) {
            System.out.println("Za du za ilośc pracowników do zatrudnienia.");
            return;
        }

        this.currentPersonalStatus = this.currentPersonalStatus + qtyEmployeeToBeHired;
    }

    //TODO; check 3th if logic
    public void dismissAnEmployee(int qtyEmployeeToBeDismiss) {
        if (qtyEmployeeToBeDismiss > currentPersonalStatus) {
            System.out.println("Nie można zwolnić więcej pracowników niż jest zatrudnionych.");
        }
        if (qtyEmployeeToBeDismiss < 0) {
            System.out.println(" Podaj liczbę dodatnią ilości pracowników do zwolnienia.");
        }
        if ((qtyEmployeeToBeDismiss < currentPersonalStatus) && (qtyEmployeeToBeDismiss > 0)) {
            this.currentPersonalStatus = this.currentPersonalStatus - qtyEmployeeToBeDismiss;
        }

    }
}
