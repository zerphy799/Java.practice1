import java.util.Scanner;

public class Work02 {
    public static void main(String[] args){
        int x,y,z=1;
        System.out.println("请输入一个非零的1位数字");
        Scanner input=new Scanner(System.in);
        x=input.nextInt();
        y=(x*9);
        if(y>=10){
            int num1,num2;
            num1=y/10;
            num2=y%10;
            z=num1+num2;
        }
        else if(y<10){
            z=y;
        }
        z=z*27+7;
        System.out.print("玩家姓名为:"+z);
    }
}
