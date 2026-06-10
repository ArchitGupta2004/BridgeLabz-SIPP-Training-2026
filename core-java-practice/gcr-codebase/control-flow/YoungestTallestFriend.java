import java.util.Scanner;
public class YoungestTallestFriend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ages of Amar, Akbar, and Anthony: ");
        int ageAmar = sc.nextInt();
        int ageAkbar = sc.nextInt();
        int ageAnthony = sc.nextInt();

        System.out.print("Enter heights of Amar, Akbar, and Anthony: ");
        double heightAmar = sc.nextDouble();
        double heightAkbar = sc.nextDouble();
        double heightAnthony = sc.nextDouble();

        int minAge = Math.min(ageAmar, Math.min(ageAkbar, ageAnthony));
        if (minAge == ageAmar) System.out.println("Youngest friend is Amar");
        else if (minAge == ageAkbar) System.out.println("Youngest friend is Akbar");
        else System.out.println("Youngest friend is Anthony");

        double maxHeight = Math.max(heightAmar, Math.max(heightAkbar, heightAnthony));
        if (maxHeight == heightAmar) System.out.println("Tallest friend is Amar");
        else if (maxHeight == heightAkbar) System.out.println("Tallest friend is Akbar");
        else System.out.println("Tallest friend is Anthony");
        sc.close();
    }
}
