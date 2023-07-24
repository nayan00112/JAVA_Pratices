
public class ArrayMethods {
    public static void main(String[] args) {
        int[] a = { 4, 6, 2, 7, 8 };

        int[] b = a.clone();
        System.out.println(a);
        System.out.println(b);
        System.out.println(a.equals(b));

        int[] c = a;
        System.out.println(a.equals(c));

        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : b) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : b) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println(a.getClass());  // class [I

        System.out.println(a.clone()+ " " + a);
        System.out.println(a.toString());
        System.out.println(a[3]);
        System.out.println(a.length);
        


    }
}
