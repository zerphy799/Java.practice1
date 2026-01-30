import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost",1024);
        System.out.println("成功连接");
        OutputStream outputStream = socket.getOutputStream();
        PrintWriter printWriter = new PrintWriter(outputStream);
        InputStream inputStream = socket.getInputStream();
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入聊天内容");
        while(true){
            String str = scanner.nextLine();
            printWriter.println(str);
            printWriter.flush();
            if(str.equals("Bye")){
                break;
            }
            String str1 = bufferedReader.readLine();
            System.out.println("服务器:"+str1);
            if(str1.equals("Bye")){
                break;
            }
        }
    }
}
