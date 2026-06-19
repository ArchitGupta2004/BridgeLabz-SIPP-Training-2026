import java.io.*;

public class EmailDomainCounter {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("emails.txt"));
        String[] domains = new String[100];
        int count = 0;
        String line;
        while ((line = br.readLine()) != null) {
            int idx = line.indexOf('@');
            if (idx != -1) {
                domains[count++] = line.substring(idx + 1);
            }
        }
        br.close();
        
        int gmail = 0, yahoo = 0;
        for (int i = 0; i < count; i++) {
            if (domains[i].equals("gmail.com")) gmail++;
            else if (domains[i].equals("yahoo.com")) yahoo++;
        }
        System.out.println("Gmail users: " + gmail);
        System.out.println("Yahoo users: " + yahoo);
    }
}
