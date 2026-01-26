import java.io.File;
import java.io.IOException;

public class TestFile {
    public static void main(String[] args) {
        //磁盘上的文件
       // File file = new File("c:/ljh/hello.txt");
        //第二种构造方法
       // File file = new File("c:/ljh","hello.txt");
        //第三种构造方法
        File file = new File("c:/ljh");
        File file1 = new File(file,"hello.txt");
        try{
            boolean a=file1.createNewFile();//如果文件不存在则创建新文件并返回True，反之为False.
            System.out.println("a="+a);
        }catch (IOException e){
            e.printStackTrace();
        }
        File dir = new File("c:/ljh/aa");
        boolean b=dir.mkdir();//同上(mkdir如果上级目录不存在，则创建失败返回False)
        //boolean b=dir.mkdirs();
        System.out.println("b="+b);
    }
}
