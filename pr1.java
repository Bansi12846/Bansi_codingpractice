import java.util.Scanner;
public class pr1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double meters = sc.nextDouble();
        double feet = meters * 3.28084;
        System.out.printf("%.2f", feet);
    }
}

// Input: 5
// Output: 16.40
