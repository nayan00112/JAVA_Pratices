public class C28_WrapperClassOrAutoBoxing {
    public static void main(String arg[])
    {
        int i = 5; // Permitive Datatype
        // Integer ii = new Integer(i); // Wrapper Class // ERROR
        // The constructor Integer(int) has been deprecated since version 9 and marked for removalJava(67110276)

        System.out.println(i);
        // System.out.println(ii);
    }
}
