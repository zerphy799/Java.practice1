import java.util.Scanner;

public class Email {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入邮箱地址来发送邮件");
        String str=input.nextLine();
        check(str);
    }
    public static void check(String email){
        String[] str=email.split("/");
        int b=0,c=0;
        for(int i=0;i<str.length;i++){
            String str1=str[i];
            int at1=str1.indexOf("@");
            int at2=str1.lastIndexOf("@");
            int dot=str1.lastIndexOf(".");
            if(at1!=-1&&at1==at2&&dot!=str1.length()-1&&dot-at1>=2){
                if(str1.contains("qq.com")){
                b++;
                }
                c++;
            }
        }
        System.out.println("成功发送了"+c+"封邮件"+"其中有"+b+"封qq邮件");
    }
}
