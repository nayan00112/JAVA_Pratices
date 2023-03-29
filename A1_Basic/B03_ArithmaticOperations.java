public class B03_ArithmaticOperations {
    public static void main(String arg[]) {
        int a = 4;
        int b = 5;

        int r = a + b;

        System.out.println(a + " + " + b + " = " + r);
        // 4 + 5 = 9

        System.out.println(a + " - " + b + " = " + (a - b));
        // 4 - 5 = -1

        System.out.println(a + " * " + b + " = " + (a * b));
        // 4 * 5 = 20

        System.out.println(a + " / " + b + " = " + ((double) a / (double) b));
        // 4 / 5 = 0.8

        System.out.println(a + " / " + b + " = " + (double) (a / b));
        // 4 / 5 = 0.0

        System.out.println(a + " % " + b + " = " + (a % b));
        // 4 % 5 = 4

        System.out.println(b + " % " + a + " = " + (b % a));
        // 5 % 4 = 1

        System.out.println(a < b); // true
        System.out.println(a > b); // false
        b = 6;
        a = b;
        System.out.println(a < b); // false
        System.out.println(a > b); // false
        System.out.println(a <= b); // true
        System.out.println(a >= b); // true

        a = 5;
        System.out.println("Value of a is "+a); // Value of a is 5
        a++;
        System.out.println("Value of a++ is "+a); // Value of a++ is 6
    }
}
