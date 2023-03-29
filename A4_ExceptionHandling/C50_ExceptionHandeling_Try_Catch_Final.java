package A4_ExceptionHandling;

public class C50_ExceptionHandeling_Try_Catch_Final {
    public static void main(String arg[]) {
        int a = 4 / 0 ;
        // compiled but error at runtime.
        System.out.print(a);

        // Outpiut Error:

        // Error: Could not find or load main class
        // C50_ExceptionHandeling_Try_Catch_Final
        // Caused by: java.lang.NoClassDefFoundError:
        // A4_ExceptionHandling/C50_ExceptionHandeling_Try_Catch_Final (wrong name:
        // C50_ExceptionHandeling_Try_Catch_Final)

        // Visit Next..
    }
}
