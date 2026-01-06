import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Game {
    public static void main(String[] args) {
        String[] str = new String[4];
        str[0] = "李白,2025年09月05日";
        str[1] = "李信,2025年09月10日";
        str[2] = "白起,2025年09月28日";
        str[3] = "李元芳,2025年10月10日";
        LocalDate date = LocalDate.of(2025, 9, 2);
        StringBuffer[] time = new StringBuffer[4];
        for (int i = 0; i < 4; i++) {
            time[i] = new StringBuffer();
        }
        for (int i = 0; i < 4; i++) {
            time[i].append(str[i].substring(str[i].indexOf(',') + 1));
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日");
        for (int i = 0; i < 4; i++) {
            LocalDate dateTime = LocalDate.parse(time[i].toString(), formatter);
            long days = date.until(dateTime, ChronoUnit.DAYS);
            if (days / 7 == 0) {
                System.out.println(str[i] + "享受8折优惠购买");
            } else if (days / 7 == 1) {
                System.out.println(str[i] + "享受9折优惠购买");
            } else if (days / 7 == 2) {
                System.out.println(str[i] + "全价购买");
            } else if (days / 7 == 3) {
                System.out.println(str[i] + "全价购买");
            } else {
                System.out.println("皮肤下架" + str[i] + "没有买到");
            }
        }
    }
}
