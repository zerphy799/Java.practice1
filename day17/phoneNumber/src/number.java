import java.util.ArrayList;
import java.util.List;

public class number {
    public static List<String> phoneNumber=new ArrayList<>();
    public number() {
        int i=0;
        while(i<=1000)
        {
            String s="1";
           int a=(int)(Math.random()*10);
           if(a==3||a==5||a==7||a==8||a==9) {
              Long b=(long) (Math.random()*1000000000);
              s=s+a+b;
              i++;
              phoneNumber.add(s);
           }
        }
    }

}
