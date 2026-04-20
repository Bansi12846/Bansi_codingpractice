class Table {
    synchronized void printTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
        System.out.println();
    }
}
class Thread1 extends Thread {
    Table t;
    Thread1(Table t) {
        this.t = t;
    }
    public void run() {
        t.printTable(5);
    }
}
class Thread2 extends Thread {
    Table t;
    Thread2(Table t) {
        this.t = t;
    }
    public void run() {
        t.printTable(7);
    }
}
public class pr25 {
    public static void main(String[] args) {
        Table obj = new Table();
        Thread1 t1 = new Thread1(obj);
        Thread2 t2 = new Thread2(obj);
        t1.start();
        t2.start();
    }
}

// Output (no mixing):
// 5 x 1 = 5
// 5 x 2 = 10
// ...
// 5 x 10 = 50
//
// 7 x 1 = 7
// 7 x 2 = 14
// ...
// 7 x 10 = 70
