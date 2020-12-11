package jaknauczycsieprogramowania2.inhabitant;

public class Parents implements Inhabitant{
    private String firstname;
    private String lastName;
    private boolean isLeaving = false;


    public boolean isLeaving() {
        System.out.println("Rodzice mieszkają.");
        return true;
    }

    @Override
    public String getFirstName() {
        return firstname;
    }

    @Override
    public String getLastName() {
        return lastName;
    }
}
