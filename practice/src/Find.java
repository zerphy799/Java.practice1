import java.util.Arrays;
import java.util.Scanner;

public class Find {
    public static void main(String[] args) {
        int[] value = new int[10];
        for (int i = 0; i < 10; i++) {
            value[i] = (int)(Math.random()*100);
        }
        int num;
        Scanner input= new Scanner(System.in);
        Arrays.sort(value);
        num=input.nextInt();
        int a=Arrays.binarySearch(value,num);
        if(a>0){
            System.out.println("可以找到且下标为"+a);

        }
        else{
            System.out.println("找不到");
        }
    }

}
