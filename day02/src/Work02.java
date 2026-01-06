import java.util.Scanner;

public class Work02 {
    static void main(String[] args) {

        float num;
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个小数");
        num = input.nextFloat();
        int num1;
        num1 = (int) (num * 100);
        num = (float) num1 / 100;
        System.out.println(num);
    }
}
