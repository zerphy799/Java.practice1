import java.util.Scanner;

public class PingPang {
    public static void main(String[] args){
        int num;
        Scanner scanner=new Scanner(System.in);
        num=scanner.nextInt();
        if(num%3==0){
            System.out.print("乒");
        }
        if(num%5==0){
            System.out.print("乓");
        }

    }
}
