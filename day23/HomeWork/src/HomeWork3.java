import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        File file=new File("D:/ff");
        try {
            boolean newFile = file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("欢迎使用彩票系统，请输入您的彩票类型和注数");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int i=sc.nextInt();
        FileWriter fileWriter= null;
        try {
            fileWriter = new FileWriter("D:/ff");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fileWriter.write(new Lottery(str,i).toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        file.delete();

    }
}
