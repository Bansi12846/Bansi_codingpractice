class Volume {
    double calculateVolume(double side) {
        return side * side * side;
    }
    double calculateVolume(double l, double w, double h) {
        return l * w * h;
    }
    double calculateVolume(double radius, int dummy) {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }
}
public class pr12 {
    public static void main(String[] args) {
        Volume v = new Volume();
        System.out.println("Cube Volume = " + v.calculateVolume(3));
        System.out.println("Rectangular Cube Volume = " + v.calculateVolume(2, 3, 4));
        System.out.println("Sphere Volume = " + v.calculateVolume(3, 1));
    }
}

// Output:
// Cube Volume = 27.0
// Rectangular Cube Volume = 24.0
// Sphere Volume = 113.09733552923255
