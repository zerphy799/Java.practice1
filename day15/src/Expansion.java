import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Expansion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BigDecimal a = new BigDecimal(input.next());
        BigDecimal c = new BigDecimal(10);
        BigDecimal d = new BigDecimal(1);
        String str=String.valueOf(a);
        int b=str.lastIndexOf('.');
        if(b!=1){
            int number=str.length();
            for (int i = 0; i < number-1; i++) {
                a=a.multiply(c);
            }
        }else{
            int number=str.length();
            for (int i = 0; i < number; i++) {
                a=a.multiply(c);
            }
        }
        a=a.divide(d,2, RoundingMode.HALF_UP);
        System.out.println(a);

    }
}
