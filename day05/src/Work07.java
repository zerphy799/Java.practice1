import java.util.Scanner;

public class Work07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size;
        System.out.println("输入一个数字");
        size = input.nextInt();
        for(int i = 0; i < size; i++){
            System.out.print("*");
        }//打印Z的横线
        System.out.println( );
        for(int j=1;j<=size-2;j++){
            for(int k=size-j;k>1;k--){
                System.out.print(" ");
            }
            System.out.println("*");
        }

        for(int i = 0; i < size; i++){
            System.out.print("*");
       }//打印Z的横线
    }
}
