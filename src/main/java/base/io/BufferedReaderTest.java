package base.io;

import java.io.File;
import java.io.FileReader;

public class BufferedReaderTest {
    public static void main(String[] args) throws Exception {

        File fe = new File("d:/str.txt");
        FileReader fr = new FileReader(fe);
        char[] chars = new char[(int) fe.length()];
        fr.read(chars);
        System.out.println(chars);

    }
}
