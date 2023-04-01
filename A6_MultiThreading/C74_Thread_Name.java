public class C74_Thread_Name {
    public static void main(String argd[]) throws Exception {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hii");
                try { Thread.sleep(200);} catch (Exception e) {}
            }
        }, "Hii Thread");
        Thread t2 = new Thread(()-> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello");
                try { Thread.sleep(200);} catch (Exception e) {}
            }
        }, "Hello Thread");

        System.out.println(t1.getName());
        System.out.println(t2.getName());

        // t1.setName("Hii Thread");
        // t2.setName("Hello Thread");

        // System.out.println(t1.getName());
        // System.out.println(t2.getName());

        t1.start();
        try { Thread.sleep(20);} catch (Exception e) {}
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Bye"); 
    }
}

// Output:
// Hii Thread
// Hello Thread
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
