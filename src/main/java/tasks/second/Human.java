package tasks.second;

public class Human {

    private double waga;
    private double wrost;

    public Human() {
        System.out.println("I am a Human without parameters");
    }

    public Human(double waga, double wrost) {
        this.waga = waga;
        this.wrost = wrost;
        System.out.println("I am a Human with parameters");
    }

    public double getWaga() {
        return waga;
    }

    public void setWaga(double waga) {
        this.waga = waga;
    }

    public double getWrost() {
        return wrost;
    }

    public void setWrost(double wrost) {
        this.wrost = wrost;
    }

    @Override
    public String toString() {
        return "Human{" +
                "waga=" + waga +
                ", wrost=" + wrost +
                '}';
    }
}
