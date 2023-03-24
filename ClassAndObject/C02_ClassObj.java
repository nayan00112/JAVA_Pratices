class NumericPrinter{
    int a = 0;

    public void printNum(int num){
        
        System.err.println("The series of five number in decresive series is...");
        for(int i = num, controlNum = 5; controlNum > 0; controlNum--, i--){
            System.err.println(i);
        }
    }
}

public class C02_ClassObj {
    public static void main(String arg[]){
        int n = 456;
        NumericPrinter obj1 = new NumericPrinter();
        NumericPrinter obj2 = new NumericPrinter();

        obj1.printNum(n);
        obj2.printNum(1);
    }
}


// Output:
// The series of five number in decresive series is...
// 456
// 455
// 454
// 453
// 452
// The series of five number in decresive series is...
// 1
// 0
// -1
// -2
// -3
