public class C76_Thread_Priority {
    public static void main(String argd[]) throws Exception {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 2; i++) {
                System.out.println("Hii " + Thread.currentThread().getPriority());
                try { Thread.sleep(200);} catch (Exception e) {}
            }
        }, "Hii Thread");
        Thread t2 = new Thread(()-> {
            for (int i = 0; i < 2; i++) {
                System.out.println("Hello " + Thread.currentThread().getPriority());
                try { Thread.sleep(200);} catch (Exception e) {}
            }
        }, "Hello Thread");

        t1.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        try { Thread.sleep(20);} catch (Exception e) {}
        t2.start();

        t1.join();
        t2.join();

    }
}

// Output:
// Hii 1
// Hello 5
// Hii 1
// Hello 5
