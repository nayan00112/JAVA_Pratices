
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class C60_FinallyBlock {
    public static void main(String[] arg) throws Exception
    {
        int n = 0;
        System.out.println("Enter a number: ");
        
        BufferedReader br = null;
        try{
            br = new BufferedReader(new InputStreamReader(System. in));
            n = Integer.parseInt(br.readLine());
            // br.close();
        }
        catch (Exception e)
        {
            System.out.println("Error is : "+e);
        }
        finally{
            br.close();
            // for this, we use 'throws Exceptions" at main method
        }
        System.out.println(n);
    }
}

// Output:
// Enter a number: 
// 44
// 44

// Output: (In invalid input):
// Enter a number: 
// df
// Error is : java.lang.NumberFormatException: For input string: "df"
// 0