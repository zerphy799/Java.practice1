import java.util.Arrays;
import java.util.Scanner;

public class Find {
    public static void main(String[] args) {
        int[] x=new int[6];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<x.length;i++){
            x[i]=sc.nextInt();
        }
        int y,a;
        y=sc.nextInt();
        a=find(x,y);
        if(a<0){
            System.out.println("没有给定的值");
        }
        else{
            System.out.println("有给定的值");
        }

    }
    public static int find(int[] x,int y){
        Arrays.sort(x);
        int c=Arrays.binarySearch(x,y);
        return c;
    }
}
