package subawy;

import java.util.ResourceBundle;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        ResourceBundle rb = ResourceBundle.getBundle("subawy/route");
        String str1,str2;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入开始出发站");
        str1=sc.nextLine();
        System.out.println("请输入终点站");
        str2=sc.nextLine();
        int a=Integer.parseInt(rb.getString(str1));
        int b=Integer.parseInt(rb.getString(str2));
        if(compute(a,b)>0&&compute(a,b)<=3){
            System.out.println("收取2元");
        }else if(compute(a,b)>3&&compute(a,b)<=5){
            System.out.println("收取3元");
        }else if(compute(a,b)>5&&compute(a,b)<=7){
            System.out.println("收取4元");
        }else{
            System.out.println("收取5元");
        }
    }
    public static int compute(int a,int b){
     if(a>b){
         return a-b;
     }
     else{
         return b-a;
     }
    }
}
