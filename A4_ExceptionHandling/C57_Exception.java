public class C57_Exception {
    public static void main(String arg[]) {
        try {
            // int a[] = null;
            // a[8] = 8;

            int i = 12;
            int j = 0;

            int k = i / j;
            System.out.println(k);
        }
        // catch (Exception e) { // if we add exception hear, then we get error, as it
        // access all type of error
        // // and below catch block can not access exceptions.
        // System.out.println("Exception Error: " + e);
        // }
        catch (ArithmeticException e) {
            System.out.println("Error : Arithmatic Error.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error : Array index out of bounds Error.");
        }

        finally {
            System.out.println("Bye.");
        }
    }
}

// Output:
// Error : Arithmatic Error.
// Bye.


// Exception block put at the last to run program easily.