import java.util.Scanner;

public class Reserve {
    public static void main(String[] args) {
        float x;
        Scanner sc = new Scanner(System.in);
        x = sc.nextFloat();
        x=reserve(x);
        System.out.println(x);
        }
    public static float reserve(float x){
        int num=(int)(x*100+0.5);
        x=(float)num/100;
        return x;
    }
    }

