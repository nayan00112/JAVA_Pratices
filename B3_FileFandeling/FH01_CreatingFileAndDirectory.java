import java.io.File;
import java.io.IOException;

public class FH01_CreatingFileAndDirectory{
    public static void main(String args[]) throws IOException{
        File myfile = new File("text01.txt");
        boolean b0 = myfile.createNewFile();
        boolean b1 = myfile.mkdirs();

        System.out.println(b0);
        System.out.println(b1);

        File myDir = new File("dir1");

        boolean b2 = myDir.createNewFile();
        boolean b3 = myDir.mkdirs();       
        boolean b4 = myDir.isDirectory();


        System.out.println(b2);
        System.out.println(b3);        
        System.out.println(b4);


    }
}