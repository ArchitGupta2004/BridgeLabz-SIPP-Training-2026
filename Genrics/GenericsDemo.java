import java.util.Arrays;
import java.util.List;

public class GenericsDemo {

    // Generic method bounded to Comparable
    public static <T extends Comparable<T>> T findMax(T[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }
        T max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].compareTo(max) > 0) {
                max = arr[i];
            }
        }
        return max;
    }

    // Utility method demonstrating wildcard List<?>
    public static void printList(List<?> list) {
        for (Object elem : list) {
            System.out.print(elem + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // 1. Demonstrate Pair
        System.out.println("--- Pair Demo ---");
        Pair<String, Integer> pair = new Pair<>("Age", 25);
        System.out.println("Pair created: " + pair);

        // 2. Demonstrate Stack
        System.out.println("\n--- Stack Demo ---");
        Stack<String> stack = new Stack<>();
        stack.push("Java");
        stack.push("Generics");
        System.out.println("Stack after pushes: " + stack);
        System.out.println("Popped: " + stack.pop());
        System.out.println("Stack after pop: " + stack);

        // 3. Demonstrate findMax
        System.out.println("\n--- findMax Demo ---");
        Integer[] intArr = {1, 5, 3, 9, 2};
        System.out.println("Max in array " + Arrays.toString(intArr) + ": " + findMax(intArr));
        
        String[] strArr = {"Apple", "Orange", "Banana"};
        System.out.println("Max in array " + Arrays.toString(strArr) + ": " + findMax(strArr));

        // 4. Demonstrate Repository
        System.out.println("\n--- Repository Demo ---");
        Repository<Double> repo = new Repository<>();
        repo.add(10.5);
        repo.add(20.0);
        System.out.println("Repository items: " + repo.getAll());

        // 5. Demonstrate wildcard printList
        System.out.println("\n--- Wildcard printList Demo ---");
        List<Integer> intList = Arrays.asList(10, 20, 30);
        System.out.print("Integer List: ");
        printList(intList);

        List<String> stringList = Arrays.asList("A", "B", "C");
        System.out.print("String List: ");
        printList(stringList);
    }
}
