// final class A {

// }

// class B extends A {  // The type B cannot subclass the final class A
// 
// }


class A{
    public void show (){
        System.out.println("In A");
    }
}

class B extends A {


}

public class C35_FinalKeyword_class {
    public static void main(String arg[]) {
        B obj = new B();
        obj.show();
    }
}

// Output:
// In A
