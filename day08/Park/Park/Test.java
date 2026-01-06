import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Data data=new Data();
        System.out.println("请输入车的类型和停留时间");
        Scanner input = new Scanner(System.in);
        data.setType(input.nextLine());
        data.setExitTime(input.nextInt());
        data.judge();
    }
}
