import java.io.FileInputStream;
import java.io.SequenceInputStream;

public class I_04_SequenceInputStream {
    public static void main(String[] args) {
        try
        {
            FileInputStream f1 = new FileInputStream("f1.txt");
            FileInputStream f2 = new FileInputStream("f2.txt");

            SequenceInputStream sis = new SequenceInputStream(f1, f2);
            int j;
            while((j=sis.read()) != -1){
                System.out.print((char)j);
            }
            sis.close();
            f1.close();
            f2.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}

// Output:
// this is a simple f1 file.
// How are you?Welcome to f2 file,
// Here you are learning sequenceinputstream.