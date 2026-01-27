import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
        System.out.println("欢迎使用签到表系统");
        String name = "";
        File fille = new File("D:/ff");
        fille.mkdir();
        Scanner input = new Scanner(System.in);
        File file1 = new File("D:/ff", "sign.txt");
        LocalDate localDate = LocalDate.now();
        StringBuffer date = new StringBuffer();
        date.append(localDate);
        date.append("签到表.txt");
        File file2 = new File("D:/ff", date.toString());
        StringBuffer date1 = new StringBuffer();
        date1.append(localDate);
        date1.append("缺席.txt");
        File file3 = new File("D:/ff", date1.toString());
        try {
            file3.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            file2.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            file1.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        while (true) {
            name = input.nextLine();
            if (!name.equals("完成")) {
                try {
                    FileWriter fileWriter = new FileWriter(file1, true);
                    fileWriter.write(name);
                    fileWriter.write(" ");
                    fileWriter.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            } else {
                break;
            }
        }
        System.out.println("请登记今日签到名单");
        name = " ";
        while (true) {
            name = input.nextLine();
            if (!name.equals("完成")) {
                try (FileWriter fileWriter = new FileWriter(file2, true);){
                    fileWriter.write(name);
                    fileWriter.write(" ");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            } else {
                break;
            }
        }
        try( FileReader fileReader = new FileReader(file1);
             FileReader fileReader1 = new FileReader(file2);
             FileWriter fileWriter = new FileWriter(file3);) {

            char[] buffer1 = new char[1024];
            char[] buffer2 = new char[1024];
            int len1, len2;
            len1 = fileReader.read(buffer1);
            len2 = fileReader1.read(buffer2);
            String str1 = new String(buffer1);
            String str2 = new String(buffer2);
            String sr3=find(str1,str2);
            fileWriter.write(sr3);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
   public static String find (String str1, String str2) {
        String[] strings1 = str1.split(" ");
        StringBuffer stringBuffer = new StringBuffer();
       for (String s : strings1) {
           boolean contains = str2.contains(s);
           if (!contains) {
               stringBuffer.append(s);
           }
       }
         return String.valueOf(stringBuffer);
    }
}
