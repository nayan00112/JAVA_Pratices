
public class C51_ExceptionHandeling {
    public static void main(String[] arg) {
        try {
            int i = 7 / 0;
            System.out.println(i);
        } catch (Exception e) {
            System.out.println("Error. 1");
        }
        System.out.println("Bye 1");

        try {
            int j = 9 / 3;
            System.out.println(j);
        } catch (Exception e) {
            System.out.println("Error. 2");
        }
        System.out.println("Bye 2");
    }
}


// Output:
// Error. 1
// Bye 1
// 3
// Bye 2