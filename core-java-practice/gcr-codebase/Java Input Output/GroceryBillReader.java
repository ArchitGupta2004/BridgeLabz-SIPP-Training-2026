import java.io.*;

public class GroceryBillReader {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("bill.txt"));
        String line;
        int count = 0;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
            count++;
        }
        System.out.println("Total lines: " + count);
        br.close();
    }
}
