import java.util.Scanner;

public class compute {
    public static void main(String[] args) {
        System.out.println("欢迎进入计算机程序");
        int num1, num2;
        int order;
        Scanner input = new Scanner(System.in);
        order = input.nextInt();
        switch (order) {
            case 1:
                System.out.println("加法运算，请输入两个整数");
                num1 = input.nextInt();
                num2 = input.nextInt();
                System.out.println("计算结果为" + (num1 + num2));
                break;
            case 2:
                System.out.println("减法运算，请输入两个整数");
                num1 = input.nextInt();
                num2 = input.nextInt();
                System.out.println("计算结果为" +num1+"-"+num2+"="+ (num1 - num2));
                break;
            case 3:
                System.out.println("乘法运算，请输入两个整数");
                num1 = input.nextInt();
                num2 = input.nextInt();
                System.out.println("计算结果为" + (num1 * num2));
                break;
            case 4:
                System.out.println("除法运算，请输入两个整数");
                num1 = input.nextInt();
                num2 = input.nextInt();
                System.out.println("计算结果为" + (num1 / num2));
                break;
            case 5:
                System.out.println("取余运算，请输入两个整数");
                num1 = input.nextInt();
                num2 = input.nextInt();
                System.out.println("计算结果为" + (num1 % num2));
                break;
            case 0:
                System.out.println("系统退出");
                break;
        }
    }
}
