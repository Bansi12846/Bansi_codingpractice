import java.util.*;

public class pr29 {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();

        marks.add(85);
        marks.add(72);
        marks.add(90);
        marks.add(66);
        marks.add(78);

        System.out.println("Marks:");
        for (int m : marks) {
            System.out.println(m);
        }

        int max = Collections.max(marks);
        int min = Collections.min(marks);

        System.out.println("Highest = " + max);
        System.out.println("Lowest = " + min);
    }
}

// Output:
// Marks:
// 85
// 72
// 90
// 66
// 78
// Highest = 90
// Lowest = 66
