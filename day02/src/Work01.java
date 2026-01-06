import java.util.Scanner;

public class Work01 {
    static void main(String[] args) {
        int num,num1, num2, num3;
        System.out.println("请输入一个三位数字");
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        num1=num/100;
        num2=num%100/10;
        num3=num%100%10;
        System.out.println("转换完成");
        System.out.print(num3);
        System.out.print(num2);
        System.out.print(num1);
    }
}
