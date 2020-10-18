package metody.DynShapes;

public class Triangle extends TwoDShape {
    // Klasa pochodna klasy bazowej TwoDShape reprezentująca trójkąty

        private String style;

        // Konstruktor domyślny
        Triangle() {
            super();
            style = "nieokreślony";
        }

        // Konstruktor z parametrami
        Triangle(String s, double w, double h) {
            super(w, h, "trójkąt");

            style = s;
        }

        // Konstruktor o jednym parametrze
        Triangle(double x) {
            super(x, "trójkąt"); // wywołanie konstruktora klasy bazowej

            style = "wypełniony";
        }

        // Tworzy obiekt na podstawie innego obiektu
        Triangle(Triangle ob) {
            super(ob); // przekazuje obiekt konstruktorowi klasy TwoDShape
            style = ob.style;
        }

        // Przesłania area() w klasie Triangle
        double area() {
            return getWidth() * getHeight() / 2;
        }

        void showStyle() {
            System.out.println("Trójkąt jest" + style);
        }
    }
