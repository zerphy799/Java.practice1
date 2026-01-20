import java.util.ArrayList;
import java.util.List;

public class CallNumber {
    public static List<String> phoneNumber=new ArrayList<>();
    public CallNumber() {

    }
    public static List getPhoneNumber() {
        int i = 0;
        while (i <= 1000) {
            StringBuffer s = new StringBuffer("1");

            int a = (int) (Math.random() * 10);
            if (a == 3 || a == 5 || a == 7 || a == 8 || a == 9) {
                Long b = (long) (Math.random() * 1000000000);
                s.append(a).append(b);
                i++;
                CallNumber.phoneNumber.add(s.toString());
            }
        }
        return phoneNumber;
    }

}
