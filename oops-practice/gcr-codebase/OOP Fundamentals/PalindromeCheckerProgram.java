public class PalindromeCheckerProgram {
    static class PalindromeChecker {
        String text;

        public PalindromeChecker(String text) {
            this.text = text;
        }

        public boolean isPalindrome() {
            String cleanText = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
            String reversed = new StringBuilder(cleanText).reverse().toString();
            return cleanText.equals(reversed);
        }

        public void displayResult() {
            System.out.println("Text: \"" + text + "\"");
            if (isPalindrome()) {
                System.out.println("Result: It is a palindrome.");
            } else {
                System.out.println("Result: It is NOT a palindrome.");
            }
        }
    }

    public static void main(String[] args) {
        PalindromeChecker checker1 = new PalindromeChecker("Racecar");
        checker1.displayResult();

        PalindromeChecker checker2 = new PalindromeChecker("Hello World");
        checker2.displayResult();
    }
}
