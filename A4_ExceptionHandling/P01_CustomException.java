// package A4_ExceptionHandling;

import java.util.Scanner;

public class P01_CustomException{
    public static void main(String[] args) throws NayanException {
        
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Number:");
        int t = s.nextInt();
        if (t == 2){
            // Just kidding :)
            throw new NayanException("Bhai, Single logo ke liye he ye!!!");
        }
        else{
            System.out.println("Welcome Single Loko!");
        }
    }
}
class NayanException extends Exception{
    NayanException(String s){
        super(s);
    }
}


// Output: 
// Enter Number:
// 2
// Exception in thread "main" NayanException: Bhai, Single logo ke liye he ye!!!
//         at P01_CustomException.main(P01_CustomException.java:12)


// Enter Number:
// 1
// Welcome Single Loko!


// Enter Number:
// 5
// Welcome Single Loko!