public class pr20 {
    public static void main(String[] args) {
        try {
            int numerator = Integer.parseInt(args[0]);
            int denominator = Integer.parseInt(args[1]);
            int result = numerator / denominator;
            System.out.println("Result = " + result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Please provide two arguments");
        } catch (NumberFormatException e) {
            System.out.println("Please enter valid integers");
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } catch (Exception e) {
            System.out.println("Some error occurred");
        }
    }
}

// java Main 10 2
// Output: Result = 5

// java Main 10 0
// Output: Cannot divide by zero

// java Main 10
// Output: Please provide two arguments

// java Main a b
// Output: Please enter valid integers
