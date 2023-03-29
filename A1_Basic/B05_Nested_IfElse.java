public class B05_Nested_IfElse {
    public static void main(String[] arg) {
        float pi = 4.54f;
        float num = 7.65f;
        int a = 0;
        a = (num > pi) ? ((int) num) : ((int) pi);
        // var = (condition)?(if true): (if false);
        
        System.out.print("value of a is " + a);
    }
}
// Output:
// value of a is 7