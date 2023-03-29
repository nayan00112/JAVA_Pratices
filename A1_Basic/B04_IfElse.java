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
    }
}

// Output:
// b is larger number.
// a is larger number.
// The value of larger number is 12

