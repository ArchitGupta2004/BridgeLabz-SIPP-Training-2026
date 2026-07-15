import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Map;

public class ConfigValidator {
    public static boolean isValidConfig(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        Map<Character, Character> matchFor = Map.of(')', '(', ']', '[', '}', '{');
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty() || stack.pop() != matchFor.get(c)) return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println("Scenario 3: Balanced Brackets — Validating Nested Config Blocks");
        String validConfig = "{ [ ( ) ] }";
        String invalidConfig1 = "{ [ ( ] ) }";
        String invalidConfig2 = "{ [ }";
        
        System.out.println("Config 1 '" + validConfig + "': " + isValidConfig(validConfig));
        System.out.println("Config 2 '" + invalidConfig1 + "': " + isValidConfig(invalidConfig1));
        System.out.println("Config 3 '" + invalidConfig2 + "': " + isValidConfig(invalidConfig2));
    }
}
