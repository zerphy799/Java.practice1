import java.util.Scanner;

public class Work08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size;
        System.out.println("请输入一个奇数来控制米字的大小");
        size = input.nextInt();
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if(j==(size+1)/2||i==(size+1)/2||i+j==size+1||i==j){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
