// package A8_Miscellaneous;

class A {
    int b = 9;

    public void show() {
        System.out.println("Hello A");
    }

    /* Only inner class can be static. outer class can not be static */
    static class B {
        public void show() {
            System.out.println("Hello B");
        }
    }
}

public class StaticClass1 {
    public static void main(String[] args) {

        A.B obj2 = new A.B();
        obj2.show();

    }
}

// Output:
// Hello B