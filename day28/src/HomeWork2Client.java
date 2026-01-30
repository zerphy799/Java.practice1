import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class HomeWork2Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 1234);
        System.out.println("已与服务器连接");
        System.out.println("请输入文件名");
        Scanner input = new Scanner(System.in);
        String fileName;
        while(true){
            fileName = input.nextLine();
            File file = new File(fileName);
            if(file.exists()){
                break;
            }else {
                System.out.println("输入错误请重新输入");
            }
        }
        OutputStream outputStream = socket.getOutputStream();
        PrintWriter printWriter = new PrintWriter(outputStream);
        InputStream inputStream = socket.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        printWriter.println(fileName);
        printWriter.flush();
        if(bufferedReader.readLine().equals("是")){
            System.out.println("服务器同意上传");
            File file = new File(fileName);
            try ( FileInputStream fis=new FileInputStream(file);
                  BufferedOutputStream bos=new BufferedOutputStream(outputStream);
                  BufferedInputStream bis=new BufferedInputStream(fis);
                ){
                byte[] b=new byte[1024];
                int len;
                while ((len=bis.read(b))!=-1){
                   bos.write(b,0,len);
                }
                System.out.println("复制完成");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }else{
            inputStream.close();
            socket.close();
            printWriter.close();
            outputStream.close();
        }
    }
}
