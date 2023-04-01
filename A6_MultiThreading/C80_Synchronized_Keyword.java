class Counter {
    int count = 0;

    public void increment() {
        count++;
    }

    public int show() {
        return count;
    }

}

public class C80_Synchronized_Keyword {
    public static void main(String arg[]) throws Exception {
        Counter c = new Counter();
     
        Thread t1 = new Thread(new Runnable() {
            public void run(){
                for(int i = 0; i < 1500; i++){
                    c.increment();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run(){
                for(int i = 0; i < 1500; i++){
                    c.increment();
                }
            }
        });
        

        t1.start();
        t2.start();


        t1.join(); // it throes Exception. use it at main method
        t2.join();
        System.out.println("Count: " + c.show());
    }
}


// Output: 
// Count: 3000

/* Amazing!
 * 
 * By tutorial, in this code there are tew thread t2 and t2.
 * Both start at same time and both use counter.
 *  so for output, we get like 1564, 2333, etc rendom number out of range 0 to 3000.(in my example)
 *  Both threads are accessing counter method at the same time, that's the issue.
 *  and wanted output is 3000. (in this example).
 *  For that problem solve by adding a synchronized keywords. Now one thread can access at the same time.
 *  another thread are in waiting if exist.
 * So we use "synchronized" keyword for solving issue.
 * 
 * but but but,
 * Hear, directly we get 3000. without using "synchronized" keyword
 * 
 * 
*/