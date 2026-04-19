import java.util.Scanner;
public class pr2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();
        double e = sc.nextDouble();
        double f = sc.nextDouble();
        double D = a * d - b * c;
        if (D == 0) {
            System.out.println("No unique solution");
        } else {
            double Dx = e * d - b * f;
            double Dy = a * f - e * c;
            double x = Dx / D;
            double y = Dy / D;
            System.out.printf("x = %.2f\n", x);
            System.out.printf("y = %.2f", y);
        }
    }
}

// Input: 2 3 1 2 8 5
// Output:
// x = 1.00
// y = 2.00
