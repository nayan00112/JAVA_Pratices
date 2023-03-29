public class C56_MultipleCatchBlock {
    public static void main(String arg[]){
        try{
            int a[] = null; // NEW TYPE OF ERROR...
            a[8] = 8;

            int i = 12;
            int j = 0;

            int k = i / j;
            System.out.println(k);
        }
        catch (ArithmeticException e){
            System.out.println("Error : Arithmatic Error.");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error : Array index out of bounds Error.");
        }

        // >>>>>>>>>>>>>>>>>> Added >>>>>>>>>>>>>>>>>>>

        catch (Exception e){ // It is good to add Exception block as it access all type of error exception
            System.out.println("Exception Error: " + e);
        }

        finally{
            System.out.println("Bye.");
        }
    }
}

// Output:
// Bye.
// Exception in thread "main" java.lang.NullPointerException: Cannot store to int array because "<local1>" is null
//         at C56_MultipleCatchBlock.main(C56_MultipleCatchBlock.java:5)

// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
// After added block:

// Exception Error: java.lang.NullPointerException: Cannot store to int array because "<local1>" is null
// Bye.
