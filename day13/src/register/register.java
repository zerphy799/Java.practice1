package register;

import java.util.Scanner;

public class register {
    public static void main(String[] args) {
        System.out.println("欢迎使用注册系统，请输入您的姓名和密码");
        String name,code;
        Scanner input=new Scanner(System.in);
        name=input.nextLine();
        code=input.nextLine();
        boolean a=false,b=true,c=false,d=false;
        for(int i=0;i<name.length();i++){
            if(!Character.isLowerCase(name.charAt(i))){
            b=false;
            }
        }
        for(int j=0;j<code.length();j++){
            if(Character.isLowerCase(code.charAt(j))){
                a=true;
            }
            if(Character.isUpperCase(code.charAt(j))){
                c=true;
            }
            if(Character.isDigit(code.charAt(j))){
                d=true;
            }


        }
        if(b){
            if(!a){
                System.out.println("注册失败，密码没有小写字母");
            }else if(!c){
                System.out.println("注册失败，密码没有大写字母");
            }else if(!d){
                System.out.println("注册失败，密码没有数字");
            }
            else {
                System.out.println("恭喜你，注册成功");
            }
        }
        else {
            System.out.println("姓名为非小写字母");
        }
    }
}
