

public class C72_isAllive_method {
    public static void main(String argd[]) throws Exception {
        // A obj1 = new A();
        // B obj2 = new B();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hii");
                try { Thread.sleep(1000);} catch (Exception e) {}
            }
        });
        Thread t2 = new Thread(()-> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello");
                try { Thread.sleep(1000);} catch (Exception e) {}
            }
        });

        System.out.println("Before t1.start(): " + t1.isAlive());
        t1.start();
        System.out.println("present t1.start(): " + t1.isAlive());
        
        try { Thread.sleep(500);} catch (Exception e) {}
        t2.start();

        t1.join();
        t2.join();
        System.out.println("At End t1.start(): " + t1.isAlive());

        System.out.println("Bye"); 
    }
}


// Output:
// Before t1.start(): false
// present t1.start(): true
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
// At End t1.start(): false
// Bye

// isAlive() method return true or false (boolean value) for if thread is allive or not .