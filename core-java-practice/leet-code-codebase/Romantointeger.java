
import java.util.*;
public class Romantointeger {
   public int romanToInt(String s) {
        int answ = 0, num = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            switch (s.charAt(i)) {

                case 'I':
                    num = 1;
                    break;
                case 'V':
                    num = 5;
                    break;
                case 'X':
                    num = 10;
                    break;
                case 'L':
                    num = 50;
                    break;
                case 'C':
                    num = 100;
                    break;
                case 'D':
                    num = 500;
                    break;
                case 'M':
                    num = 1000;
                    break;
            }
            if (4 * num < answ)
                answ -= num;
            else
                answ += num;
        }
        return answ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roman Number: ");
        String s = sc.nextLine();
        Romantointeger converter = new Romantointeger();
        System.out.println("Integer Value: " + converter.romanToInt(s));
       
    }
}
