public class C15_Array_Enhanced_forLoop {
    public static void main(String arg[]) {
        int a[][] = {
                { 4, 6, 7, 8 },
                { 6, 7, 8 },
                { 6, 8, 3, 2, 6 },
                { 6, 7, 8, 9 }
        };

        for (int n[] : a) {
            for (int m : n) {
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}

// Output:
// 4 6 7 8 
// 6 7 8 
// 6 8 3 2 6 
// 6 7 8 9 