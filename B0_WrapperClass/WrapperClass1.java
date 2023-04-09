public class WrapperClass1{
    public static void main(String[] args) {
        int n = 9;
        Integer i = new Integer(9); // call boxing
        // > it is old and might be removed in future
        // > it is still there but might be removed in future.
        // > use alternativ method of it.
        // Visite next for good way to assign it

        System.out.println(i);
    }
}

// Output: (With warning):
// warning: [removal] Integer(int) in Integer has been deprecated and marked for removal
// Integer i = new Integer(9);     
//             ^
// 1 warning
// 9
