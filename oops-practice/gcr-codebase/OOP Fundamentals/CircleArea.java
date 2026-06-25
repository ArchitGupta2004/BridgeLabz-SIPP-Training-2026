public class CircleArea {
    static class Circle {
        double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        public double calculateArea() {
            return Math.PI * radius * radius;
        }

        public double calculateCircumference() {
            return 2 * Math.PI * radius;
        }

        public void displayDetails() {
            System.out.printf("Radius: %.2f\n", radius);
            System.out.printf("Area: %.2f\n", calculateArea());
            System.out.printf("Circumference: %.2f\n", calculateCircumference());
        }
    }

    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        circle.displayDetails();
    }
}
