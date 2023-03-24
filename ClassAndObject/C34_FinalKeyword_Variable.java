/* 
 * Final keyword can be used with 
 * >>> Variables, 
 * >>> Methods and 
 * >>> Class.
*/


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