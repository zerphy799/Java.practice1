import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class HomeWork1Client {
    public static void main(String[] args) throws IOException {
        System.out.println("欢迎使用");
        Socket socket = new Socket("localhost", 1234);
        Scanner input = new Scanner(System.in);
        System.out.println("已与服务器建立连接，开始游戏");
        OutputStream out = socket.getOutputStream();
        PrintWriter printWriter = new PrintWriter(out);
        InputStream inputStream = socket.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        while(true){
            System.out.println("请输入数字");
            String str2=input.nextLine();
            printWriter.println(str2);
            printWriter.flush();
            String str=bufferedReader.readLine();
            System.out.println(str);
            if(str.equals("恭喜你猜对了")){
                break;
            }

        }
        socket.close();
        bufferedReader.close();
        inputStream.close();
        printWriter.close();
    }
}
