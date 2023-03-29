/*
 * Intrface has no constructor because there is no need for constructor as it is not allowed to make its objects.
*/

interface Abc{
    void show();
}
class Implementer implements Abc{
    public  void show(){
        System.out.print("hello show");
    }
}
public class C38_MoreAboutInterface {
    public static void main(String arg[]) {
        Abc obj = new Implementer();
        obj.show();
    }
}

// output
// hello show