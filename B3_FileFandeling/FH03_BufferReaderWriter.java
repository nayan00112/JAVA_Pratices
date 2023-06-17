import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FH03_BufferReaderWriter {
    public static void main(String[] args) throws IOException {
        try {
            try (BufferedReader br = new BufferedReader(new FileReader("text03.txt"))) {
                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        BufferedWriter bw = new BufferedWriter(new FileWriter("ForFH03.txt"));
        String s = "Hello Nayan, How are You?";
        bw.write(s);
        bw.close();
    }
}
