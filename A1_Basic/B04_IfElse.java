public class B04_IfElse {
    public static void main(String[] arg) {
        int a = 5;
        int b = 6;

        if (a < b)
            System.out.println("b is larger number.");
        else
            System.out.println("a is larger number.");

        a = 12;
        b = 9;
        if (a < b) {
            System.out.println("b is larger number.");
            System.out.println("The value of larger number is " + b);
        } else {
            System.out.println("a is larger number.");
            System.out.println("The value of larger number is " + a);
        }

        float pi = 4.54f;
        float num = 7.65f;
        int aa = 0;
        aa = (num > pi) ? ((int) num) : ((int) pi);
        // var = (condition)?(if true): (if false);
        
        System.out.print("value of a is " + aa);
    }
}

// Output:
// b is larger number.
// a is larger number.
// The value of larger number is 12
// value of a is 7
