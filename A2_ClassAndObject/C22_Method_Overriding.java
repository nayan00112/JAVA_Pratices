class A {
    void calc(int a, int b) {
        System.out.println("a + b is :" + (a + b));
        System.out.println("In Class A");
        System.out.println();
    }
}

class B extends A {
    // compile time errors are much batter then runtime error. so method overriding is consept use where inheritance, both parent and child node have same method.
    @Override
    void calc(int a, int b) {
        super.calc(a, b); // for super class method calls.
        System.out.println("a + b is :" + (a + b));
        System.out.println("In Class B");
        System.out.println();
    }
}

public class C22_Method_Overriding {
    public static void main(String arg[]) {
        A objA = new A();
        objA.calc(3, 6);

        B objB = new B();
        objB.calc(4, 6);

        A objArB = new B();
        objArB.calc(5, 7);
    }
}

// Output:
// a + b is :9
// In Class A

// a + b is :10
// In Class A

// a + b is :10
// In Class B

// a + b is :12
// In Class A

// a + b is :12
// In Class B
