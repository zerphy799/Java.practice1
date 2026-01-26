import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("欢迎使用注册系统，请输入您的用户名");
        String name = input.nextLine();
        File file = new File("D:/user");
        file.mkdir();
        name=name+".txt";
        File file2 = new File("D:/user",name);
        boolean newFile = file2.createNewFile();
        if(newFile){
            System.out.println("请输入密码");
            String password=input.nextLine();
            HomeWork1User user = new HomeWork1User(name,password);
            FileOutputStream fos = new FileOutputStream(file2);
            ObjectOutputStream ob =new ObjectOutputStream(fos);
            ob.writeObject(user);
        }else{
            System.out.println("用户名重复,注册失败");
        }

    }
}
