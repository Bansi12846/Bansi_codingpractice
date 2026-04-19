import java.util.Scanner;
class Employee {
    private String employeeName;
    private double employeeSalary;
    public void readEmployeeData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        employeeName = sc.nextLine();
        System.out.print("Enter salary: ");
        employeeSalary = sc.nextDouble();
    }
    public void displayEmployeeData() {
        System.out.println("Name: " + employeeName);
        System.out.println("Salary: " + employeeSalary);
    }
}
public class pr7 {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.readEmployeeData();
        e.displayEmployeeData();
    }
}

// Input:
// John
// 50000
// Output:
// Name: John
// Salary: 50000.0
