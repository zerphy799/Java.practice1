//public class Work03 {
//    public static void main(String[] args){
//        float num;
//        System.out.println("请输入一个数字");
//        Scanner input = new Scanner(System.in);
//        num = input.nextFloat();
//        int num1;
//        num1=(int)(num*100+0.5);
//        num=(float)num1/100;
//        System.out.println(num);
//    }
//}

import java.util.Scanner;

public class Work03 {
    //BigDecimal
    static void main() {
        float num;
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个小数" );
        num=input.nextFloat();
        num= Float.parseFloat(String.format("%.2f",num));
        System.out.println(num);
        System.out.println(0.1*3);
    }
}

