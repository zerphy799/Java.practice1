import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Collections;
import java.util.Comparator;

public class test extends staffInformation {
    public static void main(String[] args) {
        staffInformation staffInformation = new staffInformation();
        Collections.sort(staff, new Comparator<staffInformation>() {
            @Override
            public int compare(staffInformation o1, staffInformation o2) {
                String a=o1.getWorkYear();
                String b=o2.getWorkYear();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                LocalDate Date = LocalDate.parse(a, formatter);
                LocalDate now = LocalDate.now();
                long days1 = Date.until(now, ChronoUnit.DAYS);
                DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                LocalDate Date1 = LocalDate.parse(b, formatter);
                LocalDate now1 = LocalDate.now();
                long days2 = Date1.until(now1, ChronoUnit.DAYS);
                 if(days1>days2){
                     return -1;
                 }else if(days1==days2){
                     return 0;
                 }
                 return 1;
            }
        });
        for (int i = 0; i < 3; i++) {
            System.out.println( staff.get(i));

        }
    }
}
