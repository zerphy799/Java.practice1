package expressage;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        String[] str=new String[6];
        str[0]="商品已出库";
        str[1]="上门收取快递";
        str[2]="送到快递中心";
        str[3]="货物运输途中";
        str[4]="货物已由快递员送货到小区分配中心";
        str[5]="货物已被收取";
        Queue<String> queue=new LinkedList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("欢迎使用在物流，请快递员输入流程编号");
        int n=sc.nextInt();
        String c="0";
        for(int i=0;i<n;i++){
            queue.offer(str[i]);
            c=queue.poll();
        }
        System.out.println("用户查询结果为");
        System.out.println(c);
    }
}
