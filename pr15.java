class Employee {
    String name;
    String department;
    Employee(String n, String d) {
        name = n;
        department = d;
    }
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
    }
}
class Manager extends Employee {
    int teamSize;
    String projectName;
    Manager(String n, String d, int t, String p) {
        super(n, d);
        teamSize = t;
        projectName = p;
    }
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Team Size: " + teamSize);
        System.out.println("Project: " + projectName);
    }
}
public class pr15{
    public static void main(String[] args) {
        Employee e = new Employee("Bansi", "IT");
        e.displayDetails();
        System.out.println();
        Employee m = new Manager("Div", "IT", 5, "AI Project");
        m.displayDetails();
    }
}

// Output:
// Name: Bansi
// Department: IT
//
// Name: Div
// Department: IT
// Team Size: 5
// Project: AI Project
