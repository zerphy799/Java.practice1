import java.util.Scanner;

public class Computer {
    public static void main(String[] args) {
        float num1,num2,result;
        char ch;
        Scanner scanner=new Scanner(System.in);
        System.out.println("请先输入两个浮点数再输入运算符");
        num1=scanner.nextFloat();
        num2=scanner.nextFloat();
        ch=scanner.next().charAt(0);
        if(ch=='*'){
            result=num1*num2;
            if(result*10%10==0){
              int result01=(int)result;
                System.out.println(result01);
            }
            else{
                System.out.println(result);
            }
        }
        else if(ch=='+'){
            result=num1+num2;
            if(result*10%10==0){
                int result01=(int)result;
                System.out.println(result01);
            }
            else{
                System.out.println(result);
            }
        }
        else if(ch=='-'){
            result=num1-num2;
            if(result*10%10==0){
                int result01=(int)result;
                System.out.println(result01);
            }
            else{
                System.out.println(result);
            }
        }
        else{
            result=num1/num2;
            if(result*10%10==0){
                int result01=(int)result;
                System.out.println(result01);
            }
            else{
                System.out.println(result);
            }
        }
    }
}
