class A implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hii");
           try { Thread.sleep(1000);} catch (Exception e) {}
        }
    }
}

class B implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");
            try { Thread.sleep(1000);} catch (Exception e) {}
        }
    }
}

public class C68_Runnable_Interface {
    public static void main(String argd[]) {
        A obj1 = new A();
        B obj2 = new B();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        try { Thread.sleep(500);} catch (Exception e) {}
        t2.start();
    }
}

// Output:
// Hii
// Hello
// Hii
// Hello
// Hii
// Hello
// Hii
// Hello
// Hii
// Hello