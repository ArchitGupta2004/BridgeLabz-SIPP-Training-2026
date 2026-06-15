public class NullPointerExceptionDemo {
    public static void generateException() {
        String text = null;
        int length = text.length(); // Generates NullPointerException
    }

    public static void handleException() {
        String text = null;
        try {
            int length = text.length();
        } catch (NullPointerException e) {
            System.out.println("Caught Exception: " + e.toString());
        }
    }

    public static void main(String[] args) {
        System.out.println("Calling handleException() first to show successful catch:");
        handleException();
        System.out.println("\nCalling generateException() now (this will crash the program):");
        generateException();
    }
}
