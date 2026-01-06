import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {
        System.out.println("请输入要购买的彩票类型和注数");
        int x,y;
        Scanner input = new Scanner(System.in);
        x = input.nextInt();
        y = input.nextInt();
        lottery(x,y);
    }
    public static void lottery(int x,int y){
        if(x==3){
            System.out.println("您的彩票号码:");
            for(int i=0;i<3;i++){
            int s=(int)(Math.random()*10);
                System.out.print(s+"\t");
            }
            System.out.println("您购买了"+y+"注");
            return;
        }
        else if(x==5) {
            System.out.println("您的彩票号码:");
            for (int i = 0; i < 5; i++) {
                int s = (int) (Math.random() * 10);
                System.out.print(s + "\t");
            }
            System.out.println("您购买了" + y + "注");
            return;
        }
        else{
            System.out.println("错误");
            return;
        }
    }
}
