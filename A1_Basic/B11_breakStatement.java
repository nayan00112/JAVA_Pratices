public class B11_breakStatement {
    public static void main(String arg[]) {
        System.out.println(
                "Print the series of even number using for loop up to number 10, add break statement in privious code.");

        for (int i = 0; i <= 20; i++) {
            if (i <= 10) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                } else {
                    continue;
                }
            } else {
                break;
            }
        }
    }
}

// Output:
// 0 2 4 6 8 10