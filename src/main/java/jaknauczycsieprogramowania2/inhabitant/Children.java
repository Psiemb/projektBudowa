package jaknauczycsieprogramowania2.inhabitant;

import tasks.second.Parent;

public class Children extends Parent {
    private int age;

    public Children(double waga, double wzrost, String nazwisko, double wiek, int age) {
        super(waga, wzrost, nazwisko, wiek);
        this.age = age;
    }

    public boolean isLeaving() {
        System.out.println("Wraz z rodzicami");
        return true;
    }



    public int getAge() {
        return age;
    }
}
