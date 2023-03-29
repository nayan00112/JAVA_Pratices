class Casio {
    double r;

    public void add(int a, int b) {
        System.out.println("In interger 2 var.");
        r = a + b;
        System.out.println(a + " + " + b + " = " + r);
        System.out.println(); // New line
    }

    public void add(double a, double b) {
        System.out.println("In double 2 var.");
        r = a + b;
        System.out.println(a + " + " + b + " = " + r);
        System.out.println(); // New line
    }

    public void add(int a, int b, int c) {
        System.out.println("In interger 3 var.");
        r = a + b + c;
        System.out.println(a + " + " + b + " + " + c + " = " + r);
        System.out.println(); // New line
    }
}

public class C08_MethodOverloading {
    public static void main(String arg[]) {
        
        Casio c1 = new Casio();

        c1.add(3, 5);

        c1.add(4.3, 5);

        c1.add(6.53, 5.886);

        c1.add(7.0, 5.0);

        c1.add(3, 6, 7);

    }
}

// Output:
// In interger 2 var.
// 3 + 5 = 8.0

// In double 2 var.
// 4.3 + 5.0 = 9.3

// In double 2 var.
// 6.53 + 5.886 = 12.416

// In double 2 var.
// 7.0 + 5.0 = 12.0

// In interger 3 var.
// 3 + 6 + 7 = 16.0