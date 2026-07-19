import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class FraudPairDetection {
    public static int[] findFraudPair(int[] amounts, int target) {
        Map<Integer, Integer> seen = new HashMap<>(); // amount -> index
        for (int i = 0; i < amounts.length; i++) {
            int complement = target - amounts[i];
            if (seen.containsKey(complement)) {
                return new int[]{seen.get(complement), i};
            }
            seen.put(amounts[i], i);
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] amounts = {200, 150, 400, 50, 100};
        int target = 450;
        int[] result = findFraudPair(amounts, target);
        System.out.println("Fraud pair indices: " + Arrays.toString(result));
    }
}
