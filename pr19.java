class Student {
    int rollNo;
    String name;
    Student(int r, String n) {
        rollNo = r;
        name = n;
    }
    void displayStudent() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
    }
}
class Result extends Student {
    int marks1, marks2, marks3;
    Result(int r, String n, int m1, int m2, int m3) {
        super(r, n);
        marks1 = m1;
        marks2 = m2;
        marks3 = m3;
    }
    void displayResult() {
        displayStudent();
        int total = marks1 + marks2 + marks3;
        double avg = total / 3.0;
        System.out.println("Marks1: " + marks1);
        System.out.println("Marks2: " + marks2);
        System.out.println("Marks3: " + marks3);
        System.out.println("Total: " + total);
        System.out.println("Average: " + avg);
    }
}
public class Main {
    public static void main(String[] args) {
        Result r = new Result(1, "Bansi", 80, 75, 90);
        r.displayResult();
    }
}

// Output:
// Roll No: 1
// Name: Bansi
// Marks1: 80
// Marks2: 75
// Marks3: 90
// Total: 245
// Average: 81.66666666666667
