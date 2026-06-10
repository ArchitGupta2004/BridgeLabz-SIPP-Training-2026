import java.util.*;
public class Subtractproductandsum {
  public int subtractProductAndSum(int n) {
        int sum = 0;
        int product = 1;
        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            product *= digit;
            n /= 10;
        }
        return product - sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        Subtractproductandsum obj = new  Subtractproductandsum();
        System.out.println("Result: " + obj.subtractProductAndSum(n));

    }
}