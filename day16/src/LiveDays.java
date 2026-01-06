import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class LiveDays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入你的出生年月，以****-**-**的格式输入");
        String date = input.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate Date = LocalDate.parse(date, formatter);
        LocalDate now = LocalDate.now();
        long days=Date.until(now, ChronoUnit.DAYS);
        System.out.println("距离您的出生日已经有"+days+"天");
    }
}
