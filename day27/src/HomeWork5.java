import java.io.*;
import java.time.LocalTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class HomeWork5 {
    public static void main(String[] args) {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(3);
        scheduler.schedule(() -> {
            File file=new File("D:/user/log.txt");
            File file1=new File("D:/user/log1.txt");
            try {
                file1.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try ( FileInputStream fis=new FileInputStream(file);
                  FileOutputStream fos=new FileOutputStream(file1);
                  BufferedInputStream bis=new BufferedInputStream(fis);
                  BufferedOutputStream bos=new BufferedOutputStream(fos)){
                byte[] b=new byte[1024];
                int len;
                while ((len=bis.read(b))!=-1){
                    bos.write(b,0,len);
                }
                System.out.println("复制完成");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        },2, TimeUnit.MINUTES);
        scheduler.schedule(()->{
            LocalTime l=LocalTime.now();
            System.out.println(l);
        },30,TimeUnit.SECONDS);
        scheduler.schedule(()->{
            boolean check=true;
            while(check){
                File file=new File("D:/user/log1.txt");
                if(file.exists()){
                    try( FileReader fr = new FileReader(file);
                    BufferedReader br=new BufferedReader(fr)) {
                        String line;
                        while((line=br.readLine())!=null){
                            System.out.println(line);
                        }
                        System.out.println("读取完成");
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    check=false;
                }else{
                    System.out.println("未发现文件，继续寻找");
                    try {
                        TimeUnit.SECONDS.sleep(30);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        },1,TimeUnit.MINUTES);
        scheduler.shutdown();
    }
}
