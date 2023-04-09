// package B0_WrapperClass;

public class WrapperClass3 {
    public static void main(String[] args) {

        // Integer i = new Integer(9); // boxing

        // this is good way to assign
        Integer i = 4; // autoboxing
        
        System.out.println(i);

        int n = i.intValue(); // unboxing
        System.out.println(n);

        int m = i; // auto-unboxing

        System.out.println(m);

    }
}

// Output:
// 4
// 4
// 4