// Exception Handeling
// Checked Exception | Finally block


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class C59_FinallyBlock {
    public static void main(String[] arg)
    {
        int n = 0;
        System.out.println("Enter a number: ");
        
        BufferedReader br = null;
        try{
            br = new BufferedReader(new InputStreamReader(System. in));
            n = Integer.parseInt(br.readLine());
            br.close();
        }
        catch (Exception e)
        {
            System.out.println("Error is : "+e);
        }
        System.out.println(n);
    }
}


// Output:
// Enter a number: 
// 4
// 4

// Output: (In case of invalid input:)
// Enter a number: 
// rr
// Error is : java.lang.NumberFormatException: For input string: "rr"
// 0

// Visite next.