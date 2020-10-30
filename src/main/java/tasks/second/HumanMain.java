package tasks.second;

public class HumanMain {
    public static void main(String[] args) {
        System.out.println("Wywowłanie z konstrultora bezparametrowego Human.");
        Human human = new Human();
        System.out.println("\nWywowłanie z konstrultora parametrowego Human.");
        Human human1 = new Human(57,170);

        System.out.println("\nWywowłanie z konstrultora bezparametrowego Parent.");
        Parent parent = new Parent();

        System.out.println("\nWywowłanie z konstrultora parametrowego Parent.");
        Parent parent1 = new Parent(93,171,"Siembab", 41);

        System.out.println("\nWywowłanie z konstrultora bezparametrowego Kid.");
        Kid kid = new Kid();

        System.out.println("\nWywowłanie z konstrultora parametrowego Kid.");
        Kid kid1 = new Kid(23, 12, "A", 20, "Niebeiskie", false);


    }
}
