import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HomeWork {
    public static void main(String[] args) {
        List<Staff> staffList = Arrays.asList(new Staff(29, "研发部", "男", "Y1012", "李白", 12000, "2016-10-10"),
                new Staff(28, "产品部", "男", "C2404", "杜甫", 14000, "2017-09-05"),
                new Staff(27, "研发部", "男", "Y1035", "白居易", 11000, "2018-05-21"),
                new Staff(29, "研发部", "男", "Y1089", "李商隐", 15000, "2016-03-19"),
                new Staff(24, "产品部", "女", "C2675", "李清照", 8000, "2021-07-16"),
                new Staff(32, "项目部", "男", "X3021", "陆游", 18000, "2014-12-20")
        );
        Map<String, List<Staff>> department = staffList.stream().collect(Collectors.groupingBy(Staff::getDepartment));
        System.out.println("公司开设了以下部门");
        department.forEach((k, v) -> System.out.println(k));
        Optional<Staff> max = staffList.stream().max(Comparator.comparing(staff -> {
            String date = staff.getWorkYear();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate Date = LocalDate.parse(date, formatter);
            LocalDate now = LocalDate.now();
            long days = Date.until(now, ChronoUnit.DAYS);
            return days;
        }));
        System.out.println("公司工作最久的老资历是" + max);
        IntSummaryStatistics summaryStatistics = staffList.stream().filter((staff) -> staff.getDepartment().equals("研发部")).collect(Collectors.summarizingInt(Staff::getSalary));
        System.out.println("研发部的平均工资和总工资分别为" + (int) summaryStatistics.getAverage() + '\t' + summaryStatistics.getSum());
        Long aLong = staffList.stream().filter(staff -> staff.getName().startsWith("李")).collect(Collectors.counting());
        System.out.println("公司姓李的有" + aLong + "人");
        System.out.println("将员工按照年龄排序结果如下");
        staffList.stream().sorted(Comparator.comparing(Staff::getAge).thenComparing(Staff::getSalary)).forEach(System.out::println);
        System.out.println("将所有员工按入职日期排序结果如下");
        Stream<Staff> workYearSorted = staffList.stream().sorted(Comparator.comparing((staff) -> {
            String date = staff.getWorkYear();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate Date = LocalDate.parse(date, formatter);
            LocalDate now = LocalDate.now();
            long days = Date.until(now, ChronoUnit.DAYS);
            return days;
        }));
        Object[] workYearSortedArray = workYearSorted.toArray();
        for (int a = workYearSortedArray.length - 1; a >= 0; a--) {
            System.out.println(workYearSortedArray[a]);
        }
        System.out.println("将员工按名字长度分组");
        Map<Integer, List<Staff>> nameGroup= staffList.stream().collect(Collectors.groupingBy(staff ->
                staff.getName().length()));
        nameGroup.forEach((k, v) -> {System.out.println("名字长度为"+k+"的有");
        v.forEach(System.out::println);
        });
        System.out.println("给产品部工资不足10000的加1000后");
         staffList.stream().filter(staff -> staff.getDepartment().equals("产品部")).filter(staff -> staff.getSalary()<=10000).map(staff -> {
             Staff staff1=new Staff(staff.getAge(), staff.getDepartment(), staff.getGender(), staff.getId(), staff.getName(), staff.getSalary()+1000,staff.getWorkYear());
              return staff1;
         }).forEach(System.out::println);
        System.out.println("将员工编号按字母排序后");
        Stream<String> stringStream = staffList.stream().map(Staff::getId);
        stringStream.sorted().forEach(System.out::println);
        Stream<String> nameStream = staffList.stream().map(Staff::getName);
        Object[] nameStreamArray = nameStream.toArray();
        for (Object o : nameStreamArray) {
            System.out.println(o);
        }

    }
}
