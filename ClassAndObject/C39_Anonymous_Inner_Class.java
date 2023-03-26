

// class A{
//     public void show(){
//         System.out.println("in A show method");
//     }
// }

// public class C39_Anonymous_Inner_Class{
//     public static void main(String arg[]) {
//         A obj = new A();
//         obj.show();
//     }
// }

//>>>>>>>>>>>>>>>>>>>> But we want this; "in the best" >>>>>>>>>>>>>>>>>>>>

// class A {
//     public void show() {
//         System.out.println("in A show method");
//     }
// }

// class B extends A {
//     public void show() {
//         System.out.println("in the best");
//     }
// }

// public class C39_Anonymous_Inner_Class {
//     public static void main(String arg[]) {
//         A obj = new B();
//         obj.show();
//     }
// }

// Output:
// in the best



/* Hear, only one time used method show in B, so we use anonymous inner class. (observe below.) */


// >>>>>>>>>>>>>>>>>>>> Anonymous_Inner_Class... >>>>>>>>>>>>>>>>>>>>
class A {
    public void show() {
        System.out.println("in A show method");
    }
}

public class C39_Anonymous_Inner_Class {
    public static void main(String arg[]) {
        // Anonymous Class
        A obj = new A(){
            public void show() {
                System.out.println("in the best");
            }
        };
        obj.show();
    }
}

// Output:
// in the best
