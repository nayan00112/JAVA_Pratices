class X {
    public final void show() {
        System.out.println("Only By X.");
        System.out.println("Cradit on this show method only have to class X.");
    }
}

class Y extends X {
    // public void show(){

    // } // Error: Cannot override the final method from X

}

public class C36_FinalKeyword_Method {
    public static void main() {

    }
}
