import java.util.*;

public class NumberChecker {
    public static void main(String[] args) {
        System.out.println("NumberChecker Utility test");
        int num = 153;
        System.out.println("Digits count of 153: " + getCountOfDigits(num));
        int[] digits = storeDigits(num);
        System.out.println("Digits of 153: " + Arrays.toString(digits));
        System.out.println("Is Duck number? " + isDuckNumber(digits));
        System.out.println("Is Armstrong number? " + isArmstrongNumber(num, digits));
        
        System.out.println("Is 28 a perfect number? " + isPerfectNumber(28));
        System.out.println("Is 12 an abundant number? " + isAbundantNumber(12));
    }

    public static int getCountOfDigits(int num) {
        if (num == 0) return 1;
        int count = 0;
        num = Math.abs(num);
        while (num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }

    public static int[] storeDigits(int num) {
        int count = getCountOfDigits(num);
        int[] digits = new int[count];
        num = Math.abs(num);
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = num % 10;
            num /= 10;
        }
        return digits;
    }

    public static boolean isDuckNumber(int[] digits) {
        for (int digit : digits) {
            if (digit == 0) return true;
        }
        return false;
    }

    public static boolean isArmstrongNumber(int num, int[] digits) {
        int sum = 0;
        int power = digits.length;
        for (int digit : digits) {
            sum += Math.pow(digit, power);
        }
        return sum == num;
    }

    public static int[] findLargestTwo(int[] digits) {
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }
        return new int[]{largest, secondLargest};
    }

    public static int[] findSmallestTwo(int[] digits) {
        int smallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;
        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }
        return new int[]{smallest, secondSmallest};
    }

    public static int getSumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) sum += digit;
        return sum;
    }

    public static int getSumOfSquaresOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) sum += Math.pow(digit, 2);
        return sum;
    }

    public static boolean isHarshadNumber(int num, int[] digits) {
        int sum = getSumOfDigits(digits);
        return num % sum == 0;
    }

    public static int[][] getDigitFrequency(int[] digits) {
        int[] freq = new int[10];
        for (int digit : digits) {
            freq[digit]++;
        }
        int uniqueCount = 0;
        for (int count : freq) {
            if (count > 0) uniqueCount++;
        }
        int[][] result = new int[uniqueCount][2];
        int index = 0;
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                result[index][0] = i;
                result[index][1] = freq[i];
                index++;
            }
        }
        return result;
    }

    public static int[] reverseDigits(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }

    public static boolean compareArrays(int[] arr1, int[] arr2) {
        return Arrays.equals(arr1, arr2);
    }

    public static boolean isPalindromeUsingDigits(int[] digits) {
        int[] reversed = reverseDigits(digits);
        return compareArrays(digits, reversed);
    }

    public static boolean isPrimeNumber(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static boolean isNeonNumber(int num) {
        int square = num * num;
        return getSumOfDigits(storeDigits(square)) == num;
    }

    public static boolean isSpyNumber(int[] digits) {
        int sum = 0, product = 1;
        for (int digit : digits) {
            sum += digit;
            product *= digit;
        }
        return sum == product;
    }

    public static boolean isAutomorphicNumber(int num) {
        int square = num * num;
        String sNum = String.valueOf(num);
        String sSquare = String.valueOf(square);
        return sSquare.endsWith(sNum);
    }

    public static boolean isBuzzNumber(int num) {
        return num % 7 == 0 || num % 10 == 7;
    }

    public static boolean isPerfectNumber(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) sum += i;
        }
        return sum == num;
    }

    public static boolean isAbundantNumber(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) sum += i;
        }
        return sum > num;
    }

    public static boolean isDeficientNumber(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) sum += i;
        }
        return sum < num;
    }

    public static boolean isStrongNumber(int num, int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += factorial(digit);
        }
        return sum == num;
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) return 1;
        int fact = 1;
        for (int i = 2; i <= n; i++) fact *= i;
        return fact;
    }
}
