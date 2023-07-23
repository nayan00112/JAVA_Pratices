
import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class I_03_BufferedInputStream {
    public static void main(String[] args) {
        try{
            FileInputStream fis = new FileInputStream("fis1.txt");
            BufferedInputStream bis = new BufferedInputStream(fis);

            int i;
            while((i=bis.read())!= -1){
                System.out.print((char)i);
            }
            bis.close();
            fis.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}

// Output:
// Hello, I am Nayan.