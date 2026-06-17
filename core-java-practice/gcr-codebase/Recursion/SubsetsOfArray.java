import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class SubsetsOfArray {
    public static void generateSubsets(int[] arr, int index, List<Integer> current, List<List<Integer>> result) {
        if (index == arr.length) {
            result.add(new ArrayList<>(current));
            return;
        }
        generateSubsets(arr, index + 1, current, result);
        current.add(arr[index]);
        generateSubsets(arr, index + 1, current, result);
        current.remove(current.size() - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array elements: ");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        List<List<Integer>> result = new ArrayList<>();
        generateSubsets(arr, 0, new ArrayList<>(), result);
        Collections.sort(result, new Comparator<List<Integer>>() {
            public int compare(List<Integer> a, List<Integer> b) {
                if(a.size() != b.size()) return a.size() - b.size();
                for(int i=0; i<a.size(); i++) {
                    if(!a.get(i).equals(b.get(i))) return a.get(i) - b.get(i);
                }
                return 0;
            }
        });
        System.out.println("Output:");
        for(List<Integer> list : result) {
            System.out.print("[");
            for(int i=0; i<list.size(); i++){
                System.out.print(list.get(i));
                if(i<list.size()-1) System.out.print(",");
            }
            System.out.println("]");
        }
        sc.close();
    }
}
