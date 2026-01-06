import java.util.Scanner;

public class Year {
    public static void main(String[] args){
        int year,month;
        Scanner scanner =new Scanner(System.in);
        year=scanner.nextInt();
        month=scanner.nextInt();
        if(year%4==0&&year%100!=0){
            switch(month){
                case 1,3,5,7,8,10,12:
                    System.out.println(month+"月有31天");
                break;
                case 2:
                    System.out.println("2月有29天");
                    break;
                case 4,6,9,11:
                    System.out.println(month+"月有30天");
                    break;
                default:
                    System.out.println("输入错误");
                    break;
            }
        }
        else{
            switch(month){
                case 1,3,5,7,8,10,12:
                    System.out.println(month+"月有31天");
                    break;
                case 2:
                    System.out.println("2月有28天");
                    break;
                case 4,6,9,11:
                    System.out.println(month+"月有30天");
                    break;
                default:
                    System.out.println("输入错误");
                    break;
            }
        }
    }
}
