/*
 * By default interface has a public abstract method even if we dont write it.
 * 
 * We can only declare mathods, not define them.
 *
 * We can use interface as referance but not use to make object of it.
 * 
 * interface >Then use> implements
 */

interface Writer {
    void write();
}

class Pen implements Writer {
    // We must override write() method as interface Writer has a public abstract
    // method.
    public void write() {
        System.out.println("I am pen and I am writing.");
    }

}

class Pencil implements Writer {
    public void write() {
        System.out.println("I am pencil and I am writing.");
    }
}

public class C37_Interface {
    public static void main(String arg[]) {

        // Writer objW = new Writer(); // Error, We can't create instance of interface.

        Pen obj1 = new Pen();
        obj1.write();

        Pencil obj2 = new Pencil();
        obj2.write();

        // We can use interface as referance but not use to make object of it.
        Writer obj3 = new Pen();
        obj3.write();

        Writer obj4 = new Pencil();
        obj4.write();
    }
}
