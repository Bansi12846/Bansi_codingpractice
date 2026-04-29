import java.util.*;

public class pr32 {

    public static <T> boolean searchElement(LinkedList<T> list, T element) {
        return list.contains(element);
    }

    public static void main(String[] args) {

        LinkedList<Integer> rollNumbers = new LinkedList<>();
        rollNumbers.add(101);
        rollNumbers.add(102);
        rollNumbers.add(103);

        System.out.println(searchElement(rollNumbers, 102));
        System.out.println(searchElement(rollNumbers, 105));

        LinkedList<String> names = new LinkedList<>();
        names.add("Bansi");
        names.add("Raj");
        names.add("Amit");

        System.out.println(searchElement(names, "Raj"));
        System.out.println(searchElement(names, "John"));
    }
}

// Output:
// true
// false
// true
// false
