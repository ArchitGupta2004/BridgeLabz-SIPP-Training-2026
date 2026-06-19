import java.io.*;

public class CustomerFeedbackAnalyzer {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        System.out.println("Enter 5 feedback messages:");
        for (int i = 0; i < 5; i++) {
            String msg = reader.readLine();
            if (msg != null && msg.toLowerCase().contains("good")) {
                count++;
            }
        }
        System.out.println("Good feedback Count = " + count);
    }
}
