class A {
    int temp;
    public A() {
        System.out.println("In A Super Class");
    }
}

class B extends A {
    int temp;
    public B() {
        System.out.println("In B Child Class");
    }
}

public class C18_Inheritance_Constructor {
    public static void main(String arg[]) {
        System.out.println("__________________________________");

        A Aobj1 = new A(); // Super Class, Parant Class
        Aobj1.temp = 1;
        System.out.println("__________________________________");

        B Bobj1 = new B(); // Sub Class, Child Class
        Bobj1.temp = 1;

        System.out.println("__________________________________");
    }
}

// Output:
// __________________________________
// In A Super Class
// __________________________________
// In A Super Class
// In B Child Class
// __________________________________

