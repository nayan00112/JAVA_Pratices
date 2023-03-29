class CalcArray {
    public int add(int... i) // example: {4, 7, 8, 1, 5, 6, 8, 7, 5, 8} for obj.
    {
        int sum = 0;
        for (int n : i) {
            sum = sum + n;
        }
        return sum;
    }
}

public class C16_ArrayCalc {
    public static void main(String arg[]) {
        CalcArray obj = new CalcArray();
        System.out.println(obj.add(4, 7, 8, 1, 5, 6, 8, 7, 5, 8));

        CalcArray obj1 = new CalcArray();
        System.out.println(obj1.add(448, 667, 54, 788, 7, 56, 4));
    }
}

// Output:
// 59
// 2024
