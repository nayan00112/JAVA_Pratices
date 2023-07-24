
import java.util.Scanner;

public class P01_CustomException{
    public static void main(String[] args) throws NayanException {
        
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Number:");
        int t = s.nextInt();
        if (t == 2){
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
