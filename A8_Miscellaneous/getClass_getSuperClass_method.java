// package A8_Miscellaneous;


class Nayan{
    int a = 5;
    public void show(){
        System.out.println("Hello Nayan");
    }
}

class A{
    public void printOky(){
        System.out.println("Okay A");
    }
}

class B extends A{
    public void sayHello(){
        System.out.println("Hello B");
    }
}

public class getClass_getSuperClass_method {
    public static void main(String[] args) {
        Nayan n1 = new Nayan();
        System.out.println(n1.getClass()); // Focus hear


        B obj = new B();
        obj.sayHello();

        System.out.println(obj.getClass().getSuperclass()); // Focus hear
        
    }
}

// Output:
// class Nayan
// Hello B
// class A