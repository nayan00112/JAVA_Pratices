// >>>>>>>>>>>>>>>>> Interface 1 >>>>>>>>>>>>>>>>>

interface Demo {
    void abc();

    default void show() {
        System.out.println("In Demo Class show Method");
    }
}

// >>>>>>>>>>>>>>>>> Interface 2 >>>>>>>>>>>>>>>>>

interface MyDemo {
    default void show() {
        System.out.println("In MyDemo Class show Method");
    }
}

// >>>>>>>>>>>>>>>>> Error Showen Class >>>>>>>>>>>>>>>>>

// class A implements Demo, MyDemo // ERROR: Duplicate default methods named
// show with the parameters () and () are inherited from the types MyDemo and
// DemoJava(67109917)
// {
// public void abc(){
// System.out.println("In A, abc method.");
// }
// }

// >>>>>>>>>>>>>>>>> Solution 1 >>>>>>>>>>>>>>>>>

// SOLUTION: Method 1: Make a show() method in class (in child class).

class A implements Demo, MyDemo 
{
    public void abc() {
        System.out.println("In A, abc method.");
    }

    // For solve error, we can override show method.
    @Override
    public void show() {
        System.out.println("In Class A, Overried show method.");
    }

}

public class C44_Multiple_Inheritance_issue_with_Interface {
    public static void main(String arg[]) {
        A obj = new A();
        obj.show();
        obj.abc();
    }
}

// Output:
// In Class A, Overried show method.
// In A, abc method.