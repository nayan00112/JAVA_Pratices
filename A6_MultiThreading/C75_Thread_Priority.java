public class C75_Thread_Priority {
    public static void main(String argd[]) throws Exception {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 2; i++) {
                System.out.println("Hii");
                try { Thread.sleep(200);} catch (Exception e) {}
            }
        }, "Hii Thread");
        Thread t2 = new Thread(()-> {
            for (int i = 0; i < 2; i++) {
                System.out.println("Hello");
                try { Thread.sleep(200);} catch (Exception e) {}
            }
        }, "Hello Thread");

        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());

        // Set Priority
        t1.setPriority(1);
        t2.setPriority(10);

        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());

        // We can use some inbuilt constnt by Thread class
        // MIN_PRIORITY = 1
        // NORM_PRIORITY = 5
        // MAX_PRIORITY = 10
        t1.setPriority(Thread.NORM_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);

        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());

        t1.start();
        try { Thread.sleep(20);} catch (Exception e) {}
        t2.start();

        t1.join();
        t2.join();

    }
}

// Output:
// 5
// 5
// 1
// 10
// 5
// 10
// Hii
// Hello
// Hii
// Hello