import java.io.BufferedReader;
import java.io.InputStreamReader;

public class C61_ExceptionHandeling_Try_with_Resource {
    public static void main(String arg[]) throws Exception
    {
        int n = 0;
        System.out.println("Enter a number: ");

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
        {
            n = Integer.parseInt(br.readLine());
        } 
        
        System.out.println(n);
    }
}

// Output:
// Enter a number: 
// 987
// 987


// Output at invalid input:
// Enter a number: 
// 5tfgv
// Exception in thread "main" java.lang.NumberFormatException: For input string: "5tfgv"
//         at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
//         at java.base/java.lang.Integer.parseInt(Integer.java:660)
//         at java.base/java.lang.Integer.parseInt(Integer.java:778)
//         at C61_ExceptionHandeling_Try_with_Resource.main(C61_ExceptionHandeling_Try_with_Resource.java:12)
