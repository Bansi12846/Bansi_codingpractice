import java.util.Scanner;
class College {
    String collegeName;
    College(String name) {
        collegeName = name;
    }
    class Admission {
        String studentName;
        String course;
        void readData() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter student name: ");
            studentName = sc.nextLine();
            System.out.print("Enter course: ");
            course = sc.nextLine();
        }
        void displayData() {
            System.out.println("College Name: " + collegeName);
            System.out.println("Student Name: " + studentName);
            System.out.println("Course: " + course);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        College c = new College("SSASIT");
        College.Admission a = c.new Admission();
        a.readData();
        a.displayData();
    }
}

// Input:
// John
// Computer Engineering
// Output:
// College Name: SSASIT
// Student Name: John
// Course: Computer Engineering
