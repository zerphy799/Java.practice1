import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        int x;
        Scanner scanner=new Scanner(System.in);
        x=scanner.nextInt();
        x=value(x);
        System.out.println(x);
    }
    public static int value(int x){
        if(x<0){
            x=-x;
            return x;
        }
        return x;
    }
}
