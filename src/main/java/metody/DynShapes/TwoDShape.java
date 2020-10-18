package metody.DynShapes;

public class TwoDShape {
    private double width;
    private double height;
    private String name;

    // Konstruktor domyślny
    TwoDShape() {
        width = height = 0.0;
        name = "none";
    }

    // Konstruktor z parametrami
    TwoDShape(double w, double h, String n) {
        width = w;
        height = h;
        name = n;
    }

    // Tworzy obiekt, którego szerokość jest taka sama jak wysokość
    TwoDShape(double x, String n) {
        width = height = x;
        name = n;
    }

    // Tworzy obiekt na podstawie innego obiektu
    TwoDShape(TwoDShape ob) {
        width = ob.width;
        height = ob.height;
        name = ob.name;
    }

    // Metody dostępowe dla składowych width i height
    double getWidth() { return width; }
    double getHeight() { return height; }
    void setWidth(double w) { width = w; }
    void setHeight(double h) { height = h; }

    String getName() { return name; }

    void showDim() {
        System.out.println("Szerokość i wysokość: " +
                width + " i " + height);
    }

    double area() {
        System.out.println("area() musi być przesłonięta w klasach pochodnych");
        return 0.0;
    }
}
