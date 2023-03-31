
import java.util.Scanner;

public class C63_UsingScanner {
    public static void main(String arg[]) {
        int n = 0;
        String c;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        n = sc.nextInt();

        System.out.println("Entered Number is " + n);

        System.out.print("Enter the String: ");
        c = sc.next();
        System.out.println(c);
    }
}

// Output:
// Enter the Number: 55
// Entered Number is 55
// Enter the String: Hello
// Hello