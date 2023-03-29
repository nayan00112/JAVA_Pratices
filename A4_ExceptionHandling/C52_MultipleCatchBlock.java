
public class C52_MultipleCatchBlock {
    public static void main(String arg[]){
        try{
            int a[] = new int[6];
            a[8] = 8;

            int i = 12;
            int j = 3;

            int k = i / j;
            System.out.println(k);
        }
        catch (ArithmeticException e){
            System.out.println("Error : Arithmatic Error.");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error : Array index out of bounds Error.");
        }

        finally{
            System.out.println("Bye.");
        }
    }
}

// Output:
// Error : Array index out of bounds Error.
// Bye.