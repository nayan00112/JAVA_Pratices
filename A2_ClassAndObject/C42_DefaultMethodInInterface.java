// Abstract class -> Define and declare
// Interface -> declare -> 1.7v
// 1.8v can define method in interface

@FunctionalInterface // Total two method so why it cant give an error? Because @FunctionalInterface
                     // there is only one abctract keyword (hear Show), there can be any number of
                     // default methods.

                     /*
                      * Actualy, In @FunctionalInterface has only one abstract
                      * method, and can have multiple default methods.
                     */
interface Demo {
    void show();

    // void abc(){
    // System.out.println("In demo class abc method.");
    // } // ERROR: By default abc is abstract method 
    // (as inside interface even if we cannot write abstract keyword there...)

    // But we can use default keywords there, and define the method.

    default void abc() {
        System.out.println("In demo class abc method.");
    }
}

class DemoImp implements Demo {
    public void show()
    {
        System.out.println("In Show.");
    }
}

public class C42_DefaultMethodInInterface {
    public static void main(String arg[]) {
        DemoImp d1 = new DemoImp();
        d1.show();
        d1.abc();
    }
    
}

// Output:
// In Show.
// In demo class abc method.