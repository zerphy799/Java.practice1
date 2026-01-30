import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(1024);
        System.out.println("等待连接");
        Socket socket = serverSocket.accept();
        System.out.println("已有计算机连接");
        InputStream inputStream = socket.getInputStream();
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader br = new BufferedReader(inputStreamReader);
        OutputStream outputStream = socket.getOutputStream();
        PrintWriter printWriter = new PrintWriter(outputStream);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String str,str1;
            str = br.readLine();
            System.out.println("客户端:"+str);
            if(str.equals("Bye")){
                break;
            }
            System.out.println("请输入回复内容");
            str1 = scanner.nextLine();
            printWriter.println(str1);
            printWriter.flush();
            if(str1.equals("Bye")){
                break;
            }
        }
        br.close();
        serverSocket.close();
        socket.close();

    }

}
