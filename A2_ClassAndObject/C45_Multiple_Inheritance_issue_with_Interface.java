
interface Demo {
    void abc();

    default void show() {
        System.out.println("In Demo Class show Method");
    }
}

interface MyDemo {
    default void show() {
        System.out.println("In MyDemo Class show Method");
    }
}

class A implements Demo, MyDemo {
    public void abc() {
        System.out.println("In A, abc method.");
    }

    // For solve error, we can override show method.
    @Override
    public void show() {
        Demo.super.show();
        // MyDemo.super.show();
        // Above both line code possibe at same time also...!
    }

}

public class C45_Multiple_Inheritance_issue_with_Interface {
    public static void main(String arg[]) {
        A obj = new A();
        obj.show();
        obj.abc();
    }
}

// Output:
// In Demo Class show Method
// In A, abc method.
