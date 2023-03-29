class Printer{
    public void show(int a){
        System.out.println(a);
    }

    public void show(float a){
        System.out.println(a);
    }

    public void show(double a){
        System.out.println(a);
    }
}


public class C31_WhyDoWeNeedAbstractClass {
    public static void main(String arg[])
    {
        Printer obj = new Printer();
        obj.show(4); // 4
        obj.show(56.45f); // 56.45
        obj.show(546.3723); // 546.3723
    }
}

// Hear, we use method overloading for numbers as arguments.
// "Number" is an abstract class who extended by Integer, int, float, double etc. class.
// So we can pass Interger arguments.
// >>>>>>>>>>>>> VISITE NEXT >>>>>>>>>>>>>