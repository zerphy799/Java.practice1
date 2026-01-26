import java.io.*;
import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        System.out.println("欢迎使用，请输入用户名");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        name +=".txt";
        File file = new File("D:/user",name);
        if(file.exists()){
            FileInputStream fis =new FileInputStream(file);
            ObjectInputStream ob =new ObjectInputStream(fis);
            HomeWork1User user =(HomeWork1User) ob.readObject();
            System.out.println("请输入密码");
            String password = sc.nextLine();
            if(password.equals(user.getPassword())){
                System.out.println("登陆成功");
                File f = new File("D:/user","properties");
                f.createNewFile();
                System.out.println("请录入学生和老师的信息");
                Student student =new Student();
                student.setName(sc.nextLine());
                student.setGender(sc.nextLine());
                Teacher teacher =new Teacher();
                teacher.setName(sc.nextLine());
                teacher.setAge(sc.nextInt());
                DataOutputStream dos = new DataOutputStream(new FileOutputStream(f,true));
                dos.writeUTF(teacher.getName());
                dos.writeInt(teacher.getAge());
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f,true));
                oos.writeObject(student);
                oos.close();
                File file1 = new File("D:/user","log.txt");
                file1.createNewFile();
                FileWriter fw = new FileWriter(file1);
                fw.write(name);
                long l = f.lastModified();
                fw.write(String.valueOf(l));
                long totalSpace = f.getTotalSpace();
                fw.write(String.valueOf(totalSpace));
                fw.close();

            }else {
                System.out.println("密码错误");
            }
        }else {
            System.out.println("用户不存在");
        }
    }
}
