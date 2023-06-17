import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FH02_FileInputOutputStream {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("text02.txt");
        // System.out.println(fis.read());
        int data;
        while ((data = fis.read()) != -1) {
            System.out.println(data);
        }

        fis.close();

        File createFile = new File("ForFH02.txt");
        boolean statusFile = createFile.createNewFile();
        System.out.println("Is file created: " + statusFile);

        String str = "Hello Nayan";
        try  {
            try (FileOutputStream fos = new FileOutputStream("ForFH02.txt")) {
                fos.write(str.getBytes());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
