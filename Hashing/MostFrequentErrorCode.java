import java.util.HashMap;
import java.util.Map;

public class MostFrequentErrorCode {
    public static int mostFrequentErrorCode(int[] codes) {
        Map<Integer, Integer> freq = new HashMap<>();
        int bestCode = codes[0];
        int bestCount = 0;
        
        for (int code : codes) {
            int count = freq.merge(code, 1, Integer::sum);
            if (count > bestCount) {
                bestCount = count;
                bestCode = code;
            }
        }
        return bestCode;
    }

    public static void main(String[] args) {
        int[] codes = {200, 404, 500, 404, 403, 404, 500, 500, 500};
        System.out.println("Most frequent error code: " + mostFrequentErrorCode(codes));
    }
}
