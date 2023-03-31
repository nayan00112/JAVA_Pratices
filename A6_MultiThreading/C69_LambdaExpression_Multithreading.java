// by this expressions, we write code fase and less no. of lines (Privious class).
// runnable is @FunctionalInterface. so there is only one method. therefore we can use lambda expression.
public class C69_LambdaExpression_Multithreading {
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