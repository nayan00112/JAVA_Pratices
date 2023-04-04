package A8_Miscellaneous;


class Nayan{
    int a = 5;
    public void show(){
        System.out.println("Hello Nayan");
    }
}
public class getClass_method {
    public static void main(String[] args) {
        Nayan n1 = new Nayan();
        System.out.println(n1.getClass());
    }
}

// Output:
// class A8_Miscellaneous.Nayan