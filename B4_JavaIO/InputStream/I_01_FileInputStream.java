
import java.io.FileInputStream;

public class I_01_FileInputStream {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("fis1.txt");
            // System.out.println(fis.read()); // Output 72
            System.out.println((char)fis.read()); // Output H            
            System.out.println((char)fis.read()); // Output e
            System.out.println((char)fis.read()); // Output l


            fis.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
