// package A9_Casting;

public class Casting01_Variable {
    public static void main(String[] args) {
        double d = 5.7932;

        // int i = d;
        // Error:
        // Type mismatch: cannot convert from double to intJava(16777233)
        // double d

        int i = (int) d;

        System.out.println(d);
        System.out.println(i);

    }

}


// Output:
// 5.7932
// 5