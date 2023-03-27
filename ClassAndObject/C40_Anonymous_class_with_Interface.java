interface Abc {
    void infoShow();

    void infoShow2();
}

public class C40_Anonymous_class_with_Interface {
    public static void main(String arg[]) {
        Abc obj = new Abc() {
            public void infoShow() {
                System.out.println("In A By anonymous class.");
            }

            public void infoShow2() {
                System.out.println("By 2, In A By anonymous class.");
            }
        };

        obj.infoShow(); // In A By anonymous class.
        obj.infoShow2(); // By 2, In A By anonymous class.

    }
}

// If we used class only one time, then do for an anonymous class.
// It saves the memory.