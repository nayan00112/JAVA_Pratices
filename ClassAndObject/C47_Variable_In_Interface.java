interface Xyz{
    void show();
    // int a; // Error:  The blank final field a may not have been initialized

    int a = 4; // We must initialize the variable.

    // Variables, by default it is the final keyword there (constant).
    // Whenever er create variable inside the interface, it is by default final keyword there.
    // Final keyword variable declared once.

    static void sayHello(){
        System.out.print("HELLO !!! " + a);
    }
}

public class C47_Variable_In_Interface {
    public static void main(String arg[]){
        Xyz.sayHello();
    }
}

// Output:
// HELLO !!! 4