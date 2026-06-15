import java.util.Scanner;

public class CalendarDisplay {
    public static String getMonthName(int m) {
        String[] months = {"", "January", "February", "March", "April", "May", "June", 
                           "July", "August", "September", "October", "November", "December"};
        return months[m];
    }

    public static boolean isLeapYear(int y) {
        return (y % 4 == 0 && y % 100 != 0) || (y % 400 == 0);
    }

    public static int getDaysInMonth(int m, int y) {
        int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (m == 2 && isLeapYear(y)) return 29;
        return days[m];
    }

    public static int getFirstDay(int m, int y) {
        int d = 1;
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + 31 * m0 / 12) % 7;
        return d0;
    }

    public static void printCalendar(int m, int y) {
        System.out.println(getMonthName(m) + " " + y);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        
        int firstDay = getFirstDay(m, y);
        int daysInMonth = getDaysInMonth(m, y);
        
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    "); // 4 spaces
        }
        
        for (int i = 1; i <= daysInMonth; i++) {
            System.out.printf("%3d ", i);
            if ((i + firstDay) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month (1-12) and year: ");
        int m = sc.nextInt();
        int y = sc.nextInt();
        printCalendar(m, y);
    }
}
