import java.util.*;

public class TriangularPark {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter side 1 of the triangular park (in meters): ");
        double side1 = scanner.nextDouble();
        System.out.print("Enter side 2 of the triangular park (in meters): ");
        double side2 = scanner.nextDouble();
        System.out.print("Enter side 3 of the triangular park (in meters): ");
        double side3 = scanner.nextDouble();
        
        double rounds = computeRounds(side1, side2, side3);
        System.out.println("Number of rounds needed to complete 5km: " + rounds);
    }
    
    public static double computeRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        double distanceInMeters = 5000;
        return distanceInMeters / perimeter;
    }
}
