import java.io.*;

public class ProductInventoryChecker {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("inventory.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            String[] parts = line.split("-");
            if (parts.length == 2 && Integer.parseInt(parts[1].trim()) == 0) {
                System.out.println(parts[0].trim() + " is out of stock");
            }
        }
        br.close();
    }
}
