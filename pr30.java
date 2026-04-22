import java.util.*;

public class pr30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sentence: ");
        String input = sc.nextLine();

        String[] words = input.split("\\s+");
        HashMap<String, Integer> map = new HashMap<>();

        for (String w : words) {
            if (map.containsKey(w)) {
                map.put(w, map.get(w) + 1);
            } else {
                map.put(w, 1);
            }
        }

        for (String key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
    }
}

// Example:
// Input: Java is fun and Java is powerful
// Output:
// Java -> 2
// is -> 2
// fun -> 1
// and -> 1
// powerful -> 1
