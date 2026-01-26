import java.io.File;
import java.io.IOException;

public class TestOthers {
    public static void main(String[] args) {
        //获取文件名
        File file =new File("D:/ljh","test.txt");
        try {
            boolean newFile = file.createNewFile();
            System.out.println(newFile);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String name = file.getName();
        System.out.println("name"+name);
        //获取目录名
        String parent = file.getParent();
        System.out.println("parent"+parent);
        //获取test.txt说在的目录
        File parentFile =file.getParentFile();
        System.out.println(parentFile.getName());
        //获取的是在File类构造方法中给出的路径
        System.out.println(file.getPath());
        System.out.println(file.getAbsolutePath());
        try {
            System.out.println(file.getCanonicalPath());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            boolean delete = file.delete();
            System.out.println(delete);
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
        long totalSpace = file.getTotalSpace();
        System.out.println("totalSpace="+totalSpace);
    }
}
