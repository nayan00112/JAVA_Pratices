
    class A {
        int temp;
        public A() {
            System.out.println("In A Super Class");
        }

        public A(int n) {
            System.out.println("In A Super Class and int: " + n);
        }
    }

    class B extends A {
        int temp;
        public B() {
            System.out.println("In B Child Class");
        }
        public B(int n) {
            System.out.println("In B Child Class and int: " + n);
        }
    }

    public class C19_Inheritance_Constructor {
        public static void main(String arg[]) {
            System.out.println("__________________________________");

            A Aobj1 = new A(3);
            Aobj1.temp = 1;
            System.out.println("__________________________________");

            B Bobj1 = new B(9);
            Bobj1.temp = 1;
            System.out.println("__________________________________");
        }
    }

// Output:
// __________________________________
// In A Super Class and int: 3
// __________________________________
// In A Super Class
// In B Child Class and int: 9
// __________________________________
