import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.Scanner;

public class User implements logIn,Finance{
    @passWord(account = "123456", password = "245614")
    private String name;
    private String password;
    @Override
    public void logIn() {
        System.out.println("请输入账户和密码");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String password = sc.nextLine();
        if(name.equals(this.name) && password.equals(this.password)){
            System.out.println("登陆成功");
            log();
        }
       else {
            System.out.println("登陆失败，系统关闭");
        }
    }

    @Override
    public void log() {
        File file =new File("D:/user/newlogin.txt");
        try {
            file.createNewFile();
            FileWriter fw = new FileWriter(file,true);
            Class<User> userClass = User.class;
            Method[] declaredMethods = userClass.getDeclaredMethods();
            fw.write(name);
            fw.write(new Date().toString());
            for (Method m : declaredMethods) {
                fw.write(m.getName());
            }
            fw.write(userClass.getSimpleName());
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }
}
