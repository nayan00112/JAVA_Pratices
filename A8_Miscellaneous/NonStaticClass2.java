// package A8_Miscellaneous;

class A {
    int b = 9;

    public void show() {
        System.out.println("Hello A");
    }

    public class B {
        public void show() {
            System.out.println("Hello B");
        }
    }
}

public class NonStaticClass2 {
    public static void main(String[] args) {

        A obj1 = new A();

        // A.B obj2 = new A.B(); // this is for static inner class.
        A.B obj2 = obj1.new B();

        obj2.show();

    }
}

// Output:
// Hello B