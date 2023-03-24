class Calc {
    public void add(int a, int b) {
        System.out.println("Integer value");
        // System.out.println(a +" + " + b + " = " + a + b); // 3 + 5 = 35 .... :)
        System.out.println(a + " + " + b + " = " + (a + b)); // Now Done ! 3 + 5 = 8
        System.out.println(); // For a new line

    }

    public void add(double a, double b) {
        System.out.println("Double value");
        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(); // For a new line
    }

}

public class C07_Method_Overloading {
    public static void main(String arg[]) {

        Calc c1 = new Calc();

        c1.add(3, 5);

        c1.add(54, 24);

        c1.add(3.322, 2.33);

        c1.add(3, 3.7);

        c1.add(7.0, 4.0);

        c1.add(7, 4);

    }
}

// Output:
// Integer value
// 3 + 5 = 8

// Integer value
// 54 + 24 = 78

// Double value
// 3.322 + 2.33 = 5.652

// Double value
// 3.0 + 3.7 = 6.7

// Double value
// 7.0 + 4.0 = 11.0

// Integer value
// 7 + 4 = 11
