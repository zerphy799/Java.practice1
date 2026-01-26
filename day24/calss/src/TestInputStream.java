import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class  TestInputStream {
    public static void main(String[] args) {
        //GBK2 字节 UTF-8 3字节
        try {
            FileInputStream fis = new FileInputStream("D/aa/hello.txt");
            InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
           // BufferedReader br = new BufferedReader(isr);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        //转换成reader

    }
}
