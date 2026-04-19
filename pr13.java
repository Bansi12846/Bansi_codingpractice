class Shape {
    double d1, d2;
    void getData(double a, double b) {
        d1 = a;
        d2 = b;
    }
}
class Triangle extends Shape {
    double area() {
        return 0.5 * d1 * d2;
    }
}
class Rectangle extends Shape {
    double area() {
        return d1 * d2;
    }
}
public class pr13 {
    public static void main(String[] args) {
        Triangle t = new Triangle();
        t.getData(4, 5);
        System.out.println("Triangle Area = " + t.area());
        Rectangle r = new Rectangle();
        r.getData(4, 5);
        System.out.println("Rectangle Area = " + r.area());
    }
}

// Output:
// Triangle Area = 10.0
// Rectangle Area = 20.0
