class Counter {
    int count = 0;

    public synchronized void increment() {
        count++;
    }

    public int show() {
        return count;
    }

}

public class C81_Synchronized_Keyword {
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


/**
 * If our method is not synchronized then it is not thread safe, multiple threads access it at a same time.
 * So we use synchronized keyword in such a case.
*/


// visite privious once..