import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        List<Staff> staffList = new ArrayList<>(Staff.getStaff());
        Stream<Staff> staffStream = staffList.stream();
        Optional<Staff> any = staffStream.filter(staff -> staff.getWage() < 10000).findAny();
        if (any.isPresent()) {
            System.out.println("有工资低于100000元的");
        }else{
        System.out.println("无");}
        Stream<Staff> staffStream1 = staffList.stream();
        Optional<Staff> any1 = staffStream1.filter(staff -> {
            if (staff.getDepartment().equals("研发部")) {
                return staff.getGender().equals("男");
            }
            return true;
        }).findAny();
        if (any1.isPresent()) {
            System.out.println("全是男性");
         }else System.out.println("不全是男性");
        Stream<Staff> staffStream2 = staffList.stream();
        staffStream2.filter(staff -> staff.getWage() > 10000).filter(staff -> {
            String date=staff.getWorkYear();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate Date = LocalDate.parse(date, formatter);
            LocalDate now = LocalDate.now();
            long days = Date.until(now, ChronoUnit.DAYS);
            return days > 1865;
        }).forEach(System.out::println);
        Stream<Staff> staffStream3 = staffList.stream();
        long number = staffStream3.filter(staff -> !staff.getDepartment().equals("项目部部")).count();
        System.out.println("非项目部有"+number+"人");
         Stream<Staff> staffStream4 = staffList.stream();
        System.out.print("5年以上工资最高的为");
        System.out.println(staffStream4.filter(staff -> {
            String date = staff.getWorkYear();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate Date = LocalDate.parse(date, formatter);
            LocalDate now = LocalDate.now();
            long days = Date.until(now, ChronoUnit.DAYS);
            return days > 1865;
        }).max((Comparator.comparingInt(Staff::getWage))));
        Stream<Staff> staffStream5 = staffList.stream();
        System.out.print("研发部年龄最小的为");
        System.out.println(staffStream5.filter(staff -> staff.getDepartment().equals("研发部")).min(Comparator.comparingInt(Staff::getAge)));
         Stream<Staff> staffStream6 = staffList.stream();
        Optional<Staff> any2 = staffStream6.filter(staff -> staff.getDepartment().equals("研发部")).findAny();
        System.out.println("研发部部门编号首字母为"+any2.get().getId().charAt(0));
    }
    }

