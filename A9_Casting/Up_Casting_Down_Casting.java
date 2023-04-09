package A9_Casting;

class A{
    public void show1(){
        System.out.println("in A Super class");
    }
}
class B extends A{
    public void show2(){
        System.out.println("in B Super class");
    }
}
public class Up_Casting_Down_Casting {
    public static void main(String[] args) {
        // up casting
        A obj =  new B();
        // A obj = (A) new B(); // this is up casting, Same output as above
        // genarly we no need to up casting, it normally works
        obj.show1();

        B obj1 = (B) obj;
        obj1.show2();
    }
}

// Output:
// in A Super class
// in B Super class
