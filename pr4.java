import java.util.Scanner;
public class pr4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double weight = sc.nextDouble();
        System.out.print("Enter height in inches: ");
        double height = sc.nextDouble();
        double kg = weight * 0.45359237;
        double meter = height * 0.0254;
        double bmi = kg / (meter * meter);
        System.out.println("BMI = " + bmi);
    }
}

// Input: 150 65
// Output: BMI = 24.958579881656807
