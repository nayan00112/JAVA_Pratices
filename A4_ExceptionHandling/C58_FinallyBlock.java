// Exception Handeling
// Checked Exception | Finally block

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class C58_FinallyBlock {
    public static void main(String[] arg) throws Exception
    {
        System.out.println("Enter a number: ");
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System. in));
        int n = Integer.parseInt(br.readLine());
    
        System.out.print(n);
    }    
}

// 1. Output:
// Enter a number: 
// 3
// 3

// 2. Output (In case invalid input):
// Enter a number: 
// j
// Exception in thread "main" java.lang.NumberFormatException: For input string: "j"
//         at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
//         at java.base/java.lang.Integer.parseInt(Integer.java:660)
//         at java.base/java.lang.Integer.parseInt(Integer.java:778)
//         at C58_FinallyBlock.main(C58_FinallyBlock.java:13)
