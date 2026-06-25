public class CircleChaining {
    static class Circle {
        double radius;

        public Circle() {
            this(1.0); // Constructor chaining to the parameterized constructor
        }

        public Circle(double radius) {
            this.radius = radius;
        }

        public void displayRadius() {
            System.out.println("Circle Radius: " + radius);
        }
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.displayRadius();

        Circle c2 = new Circle(5.5);
        c2.displayRadius();
    }
}
