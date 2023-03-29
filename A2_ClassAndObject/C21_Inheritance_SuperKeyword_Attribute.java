class A {
    int temp;

    public A() {
        System.out.println("In A Super Class");
    }
    public A(int a, int b) {
        System.out.println("In A Super Class, Addition: "+ (a + b));
    }
}

class B extends A {
    int temp;

    public B() {
        super(4, 6); // We can pass parameter for super class constructor overloading.
        System.out.println("In B Child Class");
    }
    public B(int a, int b) {
        super();
        System.out.println("In B Child Class, Addition: " + (a + b));
    }
}

public class C21_Inheritance_SuperKeyword_Attribute {
    public static void main(String arg[]) {

        System.out.println("___________________________");
        B obj = new B();
        obj.temp = 1;

        System.out.println("___________________________");
        B obj2 = new B(4, 8);
        obj2.temp = 1;

        System.out.println("___________________________");
        B obj3 = new B(5, 7);
        obj3.temp = 1;
    }
}

// Output:
// ___________________________
// In A Super Class, Addition: 10
// In B Child Class
// ___________________________
// In A Super Class
// In B Child Class, Addition: 12
// ___________________________
// In A Super Class
// In B Child Class, Addition: 12