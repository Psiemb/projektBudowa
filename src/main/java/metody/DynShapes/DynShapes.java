package metody.DynShapes;

public class DynShapes {
    public static void main(String args[]) {
        TwoDShape shapes[] = new TwoDShape[5];

        shapes[0] = new Triangle("pusty", 8.0, 12.0);
        shapes[1] = new Rectangle(10);
        shapes[2] = new Rectangle(10, 4);
        shapes[3] = new Triangle(7.0);
        shapes[4] = new TwoDShape(10, 20, "ogólny");

        for(int i=0; i < shapes.length; i++) {
            System.out.println("Typ obiektu: " + shapes[i].getName());
            System.out.println("Powierzchnia wynosi " + shapes[i].area());

            System.out.println();
        }
    }
}
