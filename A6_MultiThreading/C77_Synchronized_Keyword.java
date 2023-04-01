/* Multithreading | Synchronized Keyword */

class Counter {
    int count = 0;

    public void increment() {
        count++;
    }

    public int show() {
        return count;
    }

}

public class C77_Synchronized_Keyword {
    public static void main(String arg[]) {
        Counter c = new Counter();
        c.increment();
        c.increment();
        c.increment();
        c.increment();

        System.out.println("Count: " + c.show());
    }
}

// Output:
// Count: 4

// Visite Next...

// Actual synchronized keyword example at code number 81. (C81_...)