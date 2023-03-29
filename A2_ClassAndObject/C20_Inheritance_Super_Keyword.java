class A {
    int temp;
    public A() {
        System.out.println("In A Super Class");
    }
}

class B extends A {
    int temp;
    public B() {
        super(); //By defaule it is in child class constructor even if we have't defined yet.
        System.out.println("In B Child Class");
    }
}

public class C20_Inheritance_Super_Keyword {
    public static void main(String arg[])
    {
        B obj = new B();
        obj.temp = 1;
    }
}

// Output: 
// In A Super Class
// In B Child Class

// The question arrise, Why it is call super class constructor?
// Actually in child class constructo has a keyword "super". Even if we do not defined, it automicaly call.
// so super() calls the super class constructor. We can pass attributes also in super() method in constructor overloding. 