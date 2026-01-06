import java.util.Scanner;

public class Disconut {
 public static void main(String[] args){
     int price;
     Scanner input=new Scanner(System.in);
     price=input.nextInt();
     if(price<500){
         System.out.println("不打折价格为"+price);
     }
     else if(price>=500&&price<1000){
         System.out.println("原价为"+price+"打9.5折后为"+price*0.95);
     }
     else if(price>=1000&&price<2000){
         System.out.println("原价为"+price+"打8折后为"+price*0.8);
     }
     else if(price>=2000){
         System.out.println("原价为"+price+"打7折后为"+price*0.7);
     }
 }

}
