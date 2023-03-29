class Printer{
    public void show(Number a){
        System.out.println(a);
    }
}


public class C32_WhyDoWeNeedAbstractClass {
    public static void main(String arg[])
    {
        Printer obj = new Printer();
        obj.show(4); // 4
        obj.show(56.45f); // 56.45
        obj.show(546.3723); // 546.3723
    }
}

/*
 * Number is a superclass for integer and double.
 * So if we use Number class as argument in method, in both int and double value can be use. float also work (any type of number work.)
*/