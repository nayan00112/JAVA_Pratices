
import java.io.FileOutputStream;

public class O_01_FileOutputStream {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("fos1.txt");
            fos.write(65);
            fos.close();
        } catch (Exception e) {
            System.out.println(e);
        }   
    }
}
