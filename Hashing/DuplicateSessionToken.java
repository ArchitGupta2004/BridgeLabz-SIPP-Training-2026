import java.util.HashSet;
import java.util.Set;

public class DuplicateSessionToken {
    public static boolean hasDuplicateToken(String[] tokens) {
        Set<String> seen = new HashSet<>();
        for (String token : tokens) {
            if (!seen.add(token)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String[] tokens = {"token1", "token2", "token3", "token1"};
        System.out.println("Has duplicate token: " + hasDuplicateToken(tokens));
        
        String[] tokens2 = {"token1", "token2", "token3"};
        System.out.println("Has duplicate token: " + hasDuplicateToken(tokens2));
    }
}
