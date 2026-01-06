import java.util.Arrays;
import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        int[] garde=new int[7];
        int num,a=0;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number of students:");
        /*for (int i = 0; i < 6; i++) {
            garde[i]=input.nextInt();
        }*/
        do{
            num=input.nextInt();
            garde[a]=num;
            a++;
            if(num>100){
                a=a-1;
                System.out.println("请重新输入");
            }
        }while(a<6);
        Arrays.sort(garde);
        int sum=0;
         for(int i=1 ;i<5;i++){
            sum+=garde[i];
            }
        System.out.println(sum/4.0);
        }
    }

