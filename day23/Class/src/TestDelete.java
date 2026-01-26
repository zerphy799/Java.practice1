import java.io.File;
import java.io.IOException;

public class TestDelete {
    public static void main(String[] args)throws IOException {
        File file = new File("c:/ljh/aa");
        boolean delete = file.delete();//立即删除文件
        // file.deleteOnExit;(JVM退出时删除文件)
        System.out.println("b="+ delete);
        File tempFile =File.createTempFile("c:/ljh/aa", ".txt");
        tempFile.deleteOnExit();
        System.out.println("tempFile="+tempFile.getAbsolutePath());
       //判断是不是文件 boolean file1 = file.isFile();

    }
}
