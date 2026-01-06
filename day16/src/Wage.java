import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Wage {
    public static void main(String[] args) {
        String [] employs=new String[4];
        employs[0]="李白,2018.02.04,8000";
        employs[1]="杜甫,2012.05.06,12000";
        employs[2]="白居易,2014.04.10,10000";
        employs[3]="陆游,2016.10.11,9000";

        StringBuffer[] workTime = new StringBuffer[4];
        for (int i = 0; i < 4; i++) {
            workTime[i] = new StringBuffer();
        }
        for (int i = 0; i < 4; i++) {
            workTime[i].append(employs[i].substring((employs[i].indexOf(',') + 1),employs[i].lastIndexOf(',') ));
        }
        StringBuffer[] Wage = new StringBuffer[4];
        for (int i = 0; i < 4; i++) {
            Wage[i] = new StringBuffer();
        }
        for (int i = 0; i < 4; i++) {
            Wage[i].append(employs[i].substring(employs[i].lastIndexOf(',')+1));
        }
      DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
        LocalDate now = LocalDate.now();
        for (int i = 0; i < 4; i++) {
            LocalDate date=LocalDate.parse(workTime[i].toString(),formatter);
            long Month=date.until(now, ChronoUnit.MONTHS);
            if (Month>100){
                int num=Integer.parseInt(Wage[i].toString());
                num+=1000;
                System.out.println(employs[i].substring(0,employs[i].indexOf(',')+1)+"工作超过了100个月加1000元工资，原工资为"+Wage[i]+"加工资后"+num);
            }
            else{
                System.out.println(employs[i].substring(0,employs[i].indexOf(',')+1)+"工作没有超过100个月加工资，维持原工资"+Wage[i]);
            }
        }
    }
}
