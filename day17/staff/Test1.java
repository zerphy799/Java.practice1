import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ListIterator;

public class Test1 extends StaffInformation{
    public static void main(String[] args) {
        float sum=0;
        float average=0;
         StaffInformation staff=new StaffInformation();
        for (Integer i : wage) {
            sum+=i;
        }
        System.out.println("工资总额为"+sum);
        average=sum/wage.size();
        System.out.println("平均工资为"+average);
        ListIterator <String>iterator=address.listIterator();
        while(iterator.hasNext()){
            String s=iterator.next();
            if(s.equals("上海市")){
                iterator.remove();
                int i=iterator.nextIndex();
                wage.remove(i);
                names.remove(i);
                workYear.remove(i);
                gender.remove(i);
                idNumber.remove(i);
                age.remove(i);
            }

        }
        ListIterator <String>iterator1=workYear.listIterator();
        while(iterator1.hasNext()) {
            String date=iterator1.next();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate Date = LocalDate.parse(date, formatter);
            LocalDate now = LocalDate.now();
            long days = Date.until(now, ChronoUnit.DAYS);
            if(days>2100){
                int i=iterator1.nextIndex();
                int a=wage.get(i-1);
                a=(int)(a*1.1);
                int s=wage.set(i-1,a);
            }
        }
        System.out.println("调整后工资如下");
        System.out.println(names);
        System.out.println(wage);
    }
}
