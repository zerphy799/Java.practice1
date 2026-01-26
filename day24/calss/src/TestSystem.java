import java.io.*;

public class TestSystem {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:/aa");
        System.setIn(fis);
        FileOutputStream fos = new FileOutputStream("D:/bb");
        System.setOut(new PrintStream(fos));
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         String str;
         while((str=br.readLine())!=null){
             System.out.println(str);
         }
    }
}
