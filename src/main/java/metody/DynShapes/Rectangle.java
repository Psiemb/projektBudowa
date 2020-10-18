package metody.DynShapes;

    // Klasa pochodna klasy bazowej TwoDShape reprezentująca prostokąty
    class Rectangle extends TwoDShape {
        // Konstruktor domyślny
        Rectangle() {
            super();
        }

        // Konstruktor z parametrami
        Rectangle(double w, double h) {
            super(w, h, "prostokąt"); // wywołanie konstruktora klasy bazowej
        }

        // Konstruktor o jednym parametrze
        Rectangle(double x) {
            super(x, "prostokąt"); // wywołanie konstruktora klasy bazowej
        }

        // Tworzy obiekt na podstawie innego obiektu
        Rectangle(Rectangle ob) {
            super(ob); // przekazuje obiekt konstruktorowi klasy TwoDShape
        }

        boolean isSquare() {
            if (getWidth() == getHeight()) return true;
            return false;
        }

        // Przesłania area() w klasie Rectangle
        double area() {
            return getWidth() * getHeight();
        }
    }
