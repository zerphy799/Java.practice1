import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        int num1;
        int num2;
        System.out.println("欢迎来到猜数字小游戏");
        num2 = (int) (Math.random() * 100 + 1);
        Scanner input=new Scanner(System.in);
        do {
            num1 = input.nextInt();

            if (num1<num2){
                System.out.println("猜小了，请重新猜");
            }
            else if(num1>num2){
                System.out.println("猜大了，请重新猜");
            }
        }while(num1!=num2);
        System.out.println("恭喜你获胜了");
    }
}
