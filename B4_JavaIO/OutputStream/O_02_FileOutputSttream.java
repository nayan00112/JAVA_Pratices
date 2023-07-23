
import java.io.FileOutputStream;
import java.util.Scanner;

public class O_02_FileOutputSttream {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Your name: ");
        String str = s.nextLine();
        try {
            FileOutputStream fos = new FileOutputStream("fos2.txt");
            fos.write(str.getBytes());
            fos.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
