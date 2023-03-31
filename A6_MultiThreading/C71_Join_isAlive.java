public class C71_Join_isAlive {
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

        t1.start();
        try { Thread.sleep(500);} catch (Exception e) {}
        t2.start();

        t1.join(); // it throws Exceptions so we use throws exception at mani class.
        t2.join(); 

        System.out.println("Bye");
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
// Bye