import java.io.File;
import java.io.IOException;

public class HomeWork3 {
    public static void main(String[] args) throws IOException {
        File file1 = new File("D:/user","newlogin1.aia");
        File file2 = new File("D:/user","newlogin2.aia");
        File file3 = new File("D:/user","FW.aia");
        file1.createNewFile();
        file2.createNewFile();
        Thread t1 = new Thread(()->{
            try {
                FileUtil.copyFile(file3,file1);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        Thread t2 = new Thread(()->{
            try {
                FileUtil.copyFile(file3,file2);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        t1.start();
        t2.start();

    }
}
