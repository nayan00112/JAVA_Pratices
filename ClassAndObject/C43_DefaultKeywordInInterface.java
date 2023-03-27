@FunctionalInterface 
interface Demo {
    void show();

    default void abc() {
        System.out.println("In demo class abc method.");
    }
}

class DemoImp implements Demo {
    public void show()
    {
        System.out.println("In Show.");
    }
    public void abc() // abc method (default method) can be override.
    {
        System.out.println("In Abc.");
    }
}

public class C43_DefaultKeywordInInterface {
    public static void main(String arg[]) {
        DemoImp d1 = new DemoImp();
        d1.show();
        d1.abc();
    }
    
}

// Output:
// In Show.
// In Abc.