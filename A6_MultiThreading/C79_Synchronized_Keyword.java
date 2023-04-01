class Counter {
    int count = 0;

    public void increment() {
        count++;
    }

    public int show() {
        return count;
    }

}

public class C79_Synchronized_Keyword {
    public static void main(String arg[]) throws Exception {
        Counter c = new Counter();
     
        Thread t1 = new Thread(new Runnable() {
            public void run(){
                for(int i = 0; i < 500; i++){
                    c.increment();
                }
            }
        });
        

        t1.start();
        t1.join(); // it throes Exception. use it at main method

        System.out.println("Count: " + c.show());
    }
}


// Output: 
// Count: 500

 
// For solving this, we use t1.join(). [use join() method.] 
