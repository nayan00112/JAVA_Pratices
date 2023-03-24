class A{
    public void show(){
        System.out.println("In A");
    }
}

class B extends A{
    public void show(){
        System.out.println("In B");
    }
}

class C extends A{
    public void show(){
        System.out.println("In C");
    }
}

public class C23_DynamicMethodDispatch{
    public static void main(String arg[])
    {
        // Compile time polymorphism and Run time polymorphism

        A obj1 = new B(); // runtime polymorphism
        obj1.show();

        obj1 = new C(); 
        obj1.show(); // Dynamic Methos Dispatch
    }
}
// Output:
// In B
// In C