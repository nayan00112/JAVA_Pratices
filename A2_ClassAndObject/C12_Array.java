public class C12_Array {
    public static void main(String arg[]) {
        /* ============================================================== */
        System.out.println("Array Type:");
        System.out.println("(1) 1D Array");
        System.out.println("(2) 2D Array");
        System.out.println("(3) Jagged Array");
        System.out.println();
        /* ============================== 1D Array ================================ */

        int arr[] = new int[6];
        arr[0] = 1;
        arr[1] = 12;
        arr[2] = 24;
        arr[3] = 36;
        arr[4] = 48;
        arr[5] = 60;

        for (int i = 0; i < 6; i++) {
            System.out.println(arr[i]);
        }
        System.out.println();

        // int num[6] = {1,2,3,4,5,6}; // GIVE ERROR
        int num[] = { 1, 2, 3, 4, 5, 6 };

        for (int i = 0; i < 6; i++) {
            System.out.println(num[i]);
        }
        System.out.println();

        /* ============================== 2D Array ================================ */

        int matrix[][] = {
                { 1, 2, 3, 4 },
                { 9, 2, 6, 7 },
                { 3, 6, 8, 0 },
                { 9, 7, 4, 3 }
        };

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        /*
         * ============================== Jagged Array ================================
         */
        int j_arr[][] = {
                { 7, 2, 3 },
                { 7, 4, 6, 4, 8 },
                { 6, 2, 0 },
                { 7, 6, 2, 1 },
                { 1, 1, 3, 4, 6 },
        };

        for (int i = 0; i < j_arr.length; i++) {
            for (int j = 0; j < j_arr[i].length; j++) {
                System.out.print(j_arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

// Output:
// Array Type:
// (1) 1D Array
// (2) 2D Array
// (3) Jagged Array

// 1
// 12
// 24
// 36
// 48
// 60

// 1
// 2
// 3
// 4
// 5
// 6

// 1 2 3 4
// 9 2 6 7
// 3 6 8 0
// 9 7 4 3

// 7 2 3
// 7 4 6 4 8
// 6 2 0
// 7 6 2 1
// 1 1 3 4 6