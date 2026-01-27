import java.util.Random;

public class FileUtil {
    public static void main(String[] args) {
        int t=new Random().nextInt(2000);
        try{
            Thread.sleep(t);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("文件读取成功耗时"+t+"秒");
    }
}
