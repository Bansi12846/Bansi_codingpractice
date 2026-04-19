class Rectangle {
    double width = 1;
    double height = 1;
    Rectangle() {
    }
    Rectangle(double w, double h) {
        width = w;
        height = h;
    }
    double getArea() {
        return width * height;
    }
    double getPerimeter() {
        return 2 * (width + height);
    }
}
class pr6 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        System.out.println("Area = " + r1.getArea());
        System.out.println("Perimeter = " + r1.getPerimeter());
        Rectangle r2 = new Rectangle(5, 3);
        System.out.println("Area = " + r2.getArea());
        System.out.println("Perimeter = " + r2.getPerimeter());
    }
}

// Output:
// Area = 1.0
// Perimeter = 4.0
// Area = 15.0
// Perimeter = 16.0
