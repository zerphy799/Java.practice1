import java.util.Scanner;

public class Work06 {
    public static void main(String[] args){
        System.out.println("请输入一个数字来控制平行四边形大小");
        int size;
        Scanner input = new Scanner(System.in);
        size=input.nextInt();
        for(int i=size;i>0;i--){
            for(int j=size;j>i;j--) {
                System.out.print(" ");
            }
                for(int k=0;k<size;k++){
                    System.out.print("*");
                }

            System.out.println();
        }
    }
}
