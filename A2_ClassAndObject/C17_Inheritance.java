class Calculator // Super class, Parant class, Base class
{
    public int add(int i, int j) {
        return i + j;
    }
}

class AdvCalc extends Calculator // Sub class, Child class, Derived class
{
    public int sub(int a, int b) {
        return a - b;
    }
}

class VeryAdvCal extends AdvCalc 
{
    public int mul(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) {
        return a / b;
    }
}

public class C17_Inheritance {
    public static void main(String arg[]) {
        int r;

        Calculator obj = new Calculator();
        AdvCalc obj1 = new AdvCalc();
        VeryAdvCal obj2 = new VeryAdvCal();

        r = obj.add(4, 6);
        System.out.println(r); // 10

        r = obj1.sub(5, 2);
        System.out.println(r); // 3

        r = obj1.add(5, 9);
        System.out.println(r); // 14

        r = obj2.add(5, 7);
        System.out.println(r); // 12

        r = obj2.sub(6, 8);
        System.out.println(r); // -2

        r = obj2.mul(5, 5);
        System.out.println(r); // 25

        r = obj2.div(8, 2);
        System.out.println(r); // 4
    }
}
