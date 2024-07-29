/*
 * Abstract Keyword
 * 
 * If we make abstract method in class, then it's class must be abstract.
 * 
 * When you only want to declare method (not defined it) then there is an abstract keyword.
 * 
 * An abstract method must be defined in child class otherwise it gives an error. Hear it is defined.
 * (not exactly error but your that class become also an abstract class.) 
 *
*/

abstract class Human {
    public abstract void eat();

    public void walk() {
        System.out.println("Humen can walk.");
    }
}

class Man extends Human {
    public void eat(){
        System.out.println("Man can eat fruits.");
    }
}

public class C30_AbstractKeyword {
    public static void main(String arg[]) {
       Human obj = new Man();
       obj.eat();
    }
}

// Output:
// Man can eat fruits.
