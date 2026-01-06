import java.util.Scanner;

public class Work01 {
    public static void main(String[] args){
        int num,bool=1;
        Scanner scanner=new Scanner(System.in);
        num=scanner.nextInt();
        for(int i=2;i<num;i++){
            if(num%i==0){
                bool=0;
                System.out.println("这个数不是素数");
                break;
            }
        }
        if(bool==1){
            System.out.println("这个数是素数");
        }
    }
}
