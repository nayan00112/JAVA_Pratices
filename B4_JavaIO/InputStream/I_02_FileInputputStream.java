
import java.io.FileInputStream;

public class I_02_FileInputputStream {
    public static void main(String[] args) {
        try {
            int a;
            FileInputStream fis = new FileInputStream("fis1.txt");
            while ((a = fis.read()) != -1) {
                System.out.print((char)a);
            }
            fis.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

// Output:
// Hello, I am Nayan.