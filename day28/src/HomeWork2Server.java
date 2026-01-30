import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class HomeWork2Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(1234);
        Socket socket = serverSocket.accept();
        System.out.println("连接成功");
        InputStream inputStream = socket.getInputStream();
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        OutputStream outputStream = socket.getOutputStream();
        PrintWriter printWriter = new PrintWriter(outputStream);
        Scanner scanner = new Scanner(System.in);
        System.out.println("接收到文件名"+bufferedReader.readLine());
        System.out.println("选择是否接受");
        String choose = scanner.nextLine();
        if (choose.equals("是")){
            System.out.println("请输入接收文件的目录");
            String dir;
            while(true) {
                dir = scanner.nextLine();
                File file = new File(dir);
                if(!file.exists()) {
                    System.out.println("目录不存在,尝试创建目录");
                    boolean mkdir = file.mkdir();
                    if(mkdir){
                        System.out.println("创建成功");
                        break;
                    }
                    System.out.println("创建失败,请重新输入");
                }
                else{
                    System.out.println("目录存在");
                    break;
                }
            }
            printWriter.println(choose);
            printWriter.flush();
            File file=new File(dir,System.currentTimeMillis()+".txt");
            FileOutputStream outputStream1 =new FileOutputStream(file);
            BufferedOutputStream bufferedOutputStream1=new BufferedOutputStream(outputStream1);
            byte[] b=new byte[1024];
            int len;
            while((len=bufferedInputStream.read(b))!=-1){
                bufferedOutputStream1.write(b,0,len);
            }
            System.out.println("复制失败");
            }
        else{
            printWriter.println(choose);
            inputStreamReader.close();
            bufferedReader.close();
            socket.close();
            serverSocket.close();
            printWriter.close();
        }

    }
}
