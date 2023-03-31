
public class C70_Join_isAlive_methods {
    public static void main(String argd[]) {
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


        System.out.println("Bye"); // It should be print at lest of the programm but output we get :
    }
}


// Output:
// Hii
// Bye
// Hello
// Hii
// Hello
// Hii
// Hello
// Hii
// Hello
// Hii
// Hello

// So for that,  we complit the thread process first, so we use t1.join() and t2.join() [Thread_objectname.join()] method. 
// Visit next...

// isAlive() method return true or false (boolean value) for if thread is allive or not .