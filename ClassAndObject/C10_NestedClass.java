// NEED TO TAKE REFERANCE (WATCH VIDOE)
class Outer {
    public void show() {
        System.out.println("In Outer Show");
    }

    class Inner {
        public void display() {
            System.out.println("In Inner Show");
        }
    }
}

public class C10_NestedClass {
    public static void main(String arg[]) {
        Outer obj = new Outer();
        obj.show();

        Outer.Inner objInner = obj.new Inner();
        objInner.display();
    }
}
// Output
// In Outer Show
// In Inner Show