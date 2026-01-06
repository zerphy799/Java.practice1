import java.util.InputMismatchException;
import java.util.Scanner;

public class Thermometer {
    public static void main(String[] args) {
        double f, h;
        f = check();
        if (f == -300) {
            System.out.println();

        } else {
            h = f * 1.8 + 32;
            System.out.println("转换后的结果" + h);
        }
    }


    public static double check() {
        double f;
        Scanner input = new Scanner(System.in);
        f = input.nextDouble();
        if (f == (double) (int) f) {
            try {
                throw new InputMismatchException();
            } catch (InputMismatchException e) {
                System.out.println("请输入小数");
                return -300;
            }
        } else {
            return f;
        }
    }
}



