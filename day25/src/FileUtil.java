import java.io.*;
import java.text.DecimalFormat;

public class FileUtil {

    public static void copyFile(File src,File dst) throws IOException {
      if(!src.exists()){
          throw new FileNotFoundException("源文件不存在");
      }
      FileInputStream fis = new FileInputStream(src);
      FileOutputStream fos = new FileOutputStream(dst);
        BufferedInputStream bis = new BufferedInputStream(fis);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
      byte[] b = new byte[1024];
      int len,sum=0;
      double a;
      DecimalFormat df = new DecimalFormat("##.00%");
        System.out.println("开始复制");
      while ((len=bis.read(b))!=-1){

          bos.write(b,0,len);
           sum+=len;
           a= (double) sum /src.length();
           if(a==1){
               System.out.println("文件操作完成");
           }else{
               System.out.println(dst.getName()+"正在复制"+df.format(a));
           }

      }
      bis.close();
      bos.close();

    }
}
