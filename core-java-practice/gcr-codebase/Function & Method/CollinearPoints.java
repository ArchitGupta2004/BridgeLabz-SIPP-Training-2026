import java.util.*;

public class CollinearPoints {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x1, y1: ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        System.out.println("Enter x2, y2: ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        System.out.println("Enter x3, y3: ");
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();

        boolean slopeMethod = checkCollinearSlope(x1, y1, x2, y2, x3, y3);
        boolean areaMethod = checkCollinearArea(x1, y1, x2, y2, x3, y3);

        System.out.println("Collinear using slope method: " + slopeMethod);
        System.out.println("Collinear using area method: " + areaMethod);
    }

    public static boolean checkCollinearSlope(double x1, double y1, double x2, double y2, double x3, double y3) {
        double slopeAB = (y2 - y1) / (x2 - x1);
        double slopeBC = (y3 - y2) / (x3 - x2);
        return slopeAB == slopeBC;
    }

    public static boolean checkCollinearArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return area == 0;
    }
}
