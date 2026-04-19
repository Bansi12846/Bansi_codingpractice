class Point {
    int x;
    int y;
    Point() {
        x = 5;
        y = 5;
    }
    Point(int a, int b) {
        x = a;
        y = b;
    }
    Point(Point p) {
        x = p.x;
        y = p.y;
    }
    void display() {
        System.out.println("Point: (" + x + ", " + y + ")");
    }
}
public class Main {
    public static void main(String[] args) {
        Point p1 = new Point();
        p1.display();
        Point p2 = new Point(2, 3);
        p2.display();
        Point p3 = new Point(p2);
        p3.display();
    }
}

// Output:
// Point: (5, 5)
// Point: (2, 3)
// Point: (2, 3)
