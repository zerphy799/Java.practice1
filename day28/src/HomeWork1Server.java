import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class HomeWork1Server {
    public static void main(String[] args) throws IOException {
        System.out.println("欢迎使用,等待玩家连接");
        ServerSocket serverSocket = new ServerSocket(1234);
       Socket socket = serverSocket.accept();
        System.out.println("玩家已连接");
        int number=(int)(Math.random()*100)+1;
        OutputStream outputStream = socket.getOutputStream();
        PrintWriter printWriter = new PrintWriter(outputStream);
        InputStream inputStream = socket.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        while(true){
            int num=Integer.parseInt(bufferedReader.readLine());
            if(num<number){
                printWriter.println("猜的太小了");
                printWriter.flush();
            }else if(num>number){
                printWriter.println("猜的太大了");
                printWriter.flush();
            }else {
                printWriter.println("恭喜你猜对了");
                printWriter.flush();
                break;
            }

        }
        serverSocket.close();
        socket.close();
        bufferedReader.close();
        inputStream.close();
        printWriter.close();
    }
}
