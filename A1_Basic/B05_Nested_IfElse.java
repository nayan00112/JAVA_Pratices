public class B05_Nested_IfElse {
    public static void main(String[] arg) {
        float n1 = 48.00f;
        float n2 = 8.65f;
        int n3 = 30;
        System.err.println("Large number is: ");
        if (n1 > n2){
            if (n1 > n3){
                System.err.println(n1);
            }
            else{
                System.out.println(n3);
            }
        }
        else{
            if (n2 > n3){
                System.err.println(n2);
            }
            else{
                System.err.println(n3);
            }
        }
    }
}
// Output:
// Large number is: 
// 48.0