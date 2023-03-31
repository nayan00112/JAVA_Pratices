
class A extends Thread {
    public void run() {
        System.out.println("Hiii");
        // try{ sleep(500);} catch (Exception e){}
        
        
    }
}

public class SimpleThreadCall {
    public static void main(String argd[]) {
        A obj1 = new A();
        A obj2 = new A();

        obj1.start();
        try{ Thread.sleep(500);} catch (Exception e){}
        obj2.start();
    }
}

// output:
// Hiii
// Hiii

