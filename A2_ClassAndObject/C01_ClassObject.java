class A {
    int a; // By default the value of undefined variable is 0
    int b = 5;

    public void showMethod() {
        System.out.println("The value of a is " + a + " And the value of b is " + b + ".");
    }
}

public class C01_ClassObject {
    public static void main(String[] arg) {
        A obj = new A();
        obj.showMethod();

        obj.a = 4;
        obj.b = 56;

        obj.showMethod();
    }
}

// Output
// The value of a is 0 A`nd the value of b is 5.
// The value of a is 4 And the value of b is 56.
