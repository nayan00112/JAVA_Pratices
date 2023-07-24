public class P02_ArithmaticException {
    public static void main(String[] args) {
        try
        {
            int s = 3/0;
            System.out.println(s);
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("Bye");
        }
    }
}
