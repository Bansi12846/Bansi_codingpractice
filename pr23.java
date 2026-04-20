class Thread1 extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Thread1: " + i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
class Thread2 extends Thread {
    public void run() {
        try {
            for (int i = 11; i <= 20; i++) {
                System.out.println("Thread2: " + i);
                Thread.sleep(500);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
public class pr23{
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();

        t1.start();
        t2.start();
    }
}

// Output (may vary):
// Thread1: 1
// Thread2: 11
// Thread2: 12
// Thread1: 2
// Thread2: 13
// Thread2: 14
// Thread1: 3
// ...
