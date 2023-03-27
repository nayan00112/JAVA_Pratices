
interface Demo {
    void show();

    static void abc() {
        System.out.println("Hello, I am in static method!!!");
        System.out.println("You can call me any time without any Object.!!!");
    }
}

public class C46_Static_method_in_interface {
    public static void main(String arg[]) {
        Demo.abc(); // We use static keywords, so we can call method without making an object.
    }
}

// Output:
// Hello, I am in static method!!!
// You can call me any time without any Object.!!!    
