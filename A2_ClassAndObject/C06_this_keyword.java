class Calc {
    int num1;
    int num2;
    int result;

    public Calc(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int sum() {
        result = num1 + num2;
        return result;
    }
}

public class C06_this_keyword {
    public static void main(String[] arg) {
        int getData;
        Calc A = new Calc(1, 4);
        getData = A.sum();
        System.out.println(getData);

        Calc B = new Calc(14, 16);
        getData = B.sum();
        System.out.println(getData);

        A = new Calc(23, 65);
        getData = A.sum();
        System.out.println(getData);
    }
}

// Output:
// 5
// 30
// 88