import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class O_03_BufferedOutputStream {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("file3.txt");
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            String str = "Hello, How are You?";
            byte b[] = str.getBytes();
            bos.write(b);
            bos.flush();
            bos.close();
            fos.close();
            System.out.println("Success");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

// Output: (in file3.txt)
// Hello, How are You?