import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWrite {
    public static void main(String[] args) {
        File inf = new File("Input.txt");
        File outf = new File("Output.txt");
        try (FileReader in = new FileReader(inf); FileWriter out = new FileWriter(outf)) {
            int ch;
            while ((ch = in.read()) != -1) {
                out.write(ch);
            }
            System.out.println("Successful");
        } catch (IOException e) {
            System.out.println(e);
            System.exit(-1);
        }
    }
}
