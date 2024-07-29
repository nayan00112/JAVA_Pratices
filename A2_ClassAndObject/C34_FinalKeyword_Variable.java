/* 
 * Final keyword can be used with 
 * >>> Variables, 
 * >>> Methods and 
 * >>> Class.
*/


// Final Variable:

// Declared using the final modifier before the variable name.
// Cannot be modified after initialization.
// Guarantees that the value of the variable will remain constant throughout the program’s execution.
// Final Method:

// Declared using the final modifier before the method name.
// Cannot be overridden by subclasses.
// Ensures that the implementation of the method will not change in subclasses.
// Final Class:

// Declared using the final modifier before the class name.
// Cannot be extended by other classes.
// Prevents the creation of subclasses and ensures that the class’s implementation is final.
// Example:

// // Final variable
// final int age = 30;

// // Final method
// final void display() {
//     System.out.println("Final method");
// }

// // Final class
// final class MyClass {
//     // No subclasses can be created
// }


// >>>>>>>>>>>>>>>>>>>>>>>>>>> Final Variable <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
class A{
    final int Day = 5; // constant
    final int i;
    public A(){
        // Day = 10;  // Error: Final keyword assign only once.
        i = 4;
        // i = 5; // Error: Final keyword assign only once.
    }
}

public class C34_FinalKeyword_Variable {
    public static void main(String arg[])
    {
        A obj = new A();
        System.out.println(obj.Day);
        System.out.println(obj.i);
    }
}


// Output:
// 5
// 4