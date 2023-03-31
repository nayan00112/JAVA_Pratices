package A4_ExceptionHandling;


public class C62_ExceptionHandling_UserDefined {
    public static void main(String arg[]) {
        int a = 0;
        int b = 2;
        

        try {
            int c = a / b;
            if (c == 0){
                throw new My_ErrorException("This is not valid answere");
            }
            System.out.println(c);
        }
        catch (My_ErrorException e) {
            System.err.println("My Error is : " + e.getMessage());
        }
        catch (Exception e) {
            System.err.println("Error is : " + e);
        }
    }
}
// Problem {{Package }} // not runable!! (Why?)

// C62_ExceptionHandling_UserDefined.java:11: error: cannot find symbol
//                 throw new My_ErrorException();
//                           ^
//   symbol:   class My_ErrorException    
//   location: class C62_ExceptionHandling_UserDefined
// C62_ExceptionHandling_UserDefined.java:15: error: cannot find symbol
//         catch (My_ErrorException e) {  
//                ^
//   symbol:   class My_ErrorException    
//   location: class C62_ExceptionHandling_UserDefined
// 2 errors