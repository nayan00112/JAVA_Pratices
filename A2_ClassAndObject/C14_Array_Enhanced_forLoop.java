public class C14_Array_Enhanced_forLoop {
    public static void main(String arg[]) {
        int matrix[][] = {
                { 3, 5, 7, 8, 9 },
                { 5, 6, 8, 9, 0 },
                { 6, 7, 9, 6, 4 },
                { 6, 4, 3, 6, 9 },
                { 4, 6, 7, 8, 0 }
        };

        for (int k[] : matrix) {
            for (int j : k) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}


// Output:
// 3 5 7 8 9 
// 5 6 8 9 0 
// 6 7 9 6 4 
// 6 4 3 6 9 
// 4 6 7 8 0 
