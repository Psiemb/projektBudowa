package metody.matematyk;

public class MatematykMain {
    public static void main(String[] args) {

        Matematyk einstein = new Matematyk();
        System.out.println(einstein.add(4.2, 5.5));
        System.out.println(einstein.subtraction(4.2, 5.5));
        System.out.println(einstein.multiplication(4.2, 5.5));
        System.out.println(einstein.division(4.2, 5.5));
        System.out.println(einstein.areasquare(4.2, 5.5));
        System.out.println(einstein.areatriangle(4.2, 5.5));

    }

}
