import java.util.Scanner;

public class Work01 {
    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner input = new Scanner(System.in);
        num1 = input.nextInt();
        num2 = input.nextInt();
        num3 = input.nextInt();
       if(num1<num2&&num1<num3){
           System.out.println(num1);
       }
       else if(num2<num1&&num2<num3){
           System.out.println(num2);
       }
       else if(num3<num2&&num3<num1){
           System.out.println(num3);

       }
    }

}
