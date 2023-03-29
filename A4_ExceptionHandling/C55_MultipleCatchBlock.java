
public class C55_MultipleCatchBlock {
    public static void main(String arg[]){
        try{
            int a[] = new int[6];
            a[0] = 8;

            int i = 12;
            int j = 0;

            int k = i / j;
            System.out.println(k);
        }
        catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println("Error :ArithmeticException. or ArrayIndexOutOfBoundsException");
        }

        finally{
            System.out.println("Bye.");
        }
    }
}

// Output:
// Error :ArithmeticException. or ArrayIndexOutOfBoundsException
// Bye.

