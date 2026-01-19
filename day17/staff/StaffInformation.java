import java.util.ArrayList;
import java.util.List;

public class StaffInformation {


    public static List<String> names = new ArrayList<>();
    public static List<String> gender = new ArrayList<>();
    public static List<String> address = new ArrayList<>();
    public static List<String> idNumber = new ArrayList<>();
    public static List<Integer> wage = new ArrayList<>();
    public static List<String> workYear = new ArrayList<>();
    public static List<Integer> age = new ArrayList<>();


    public StaffInformation() {
        names.add("李白");
        names.add("杜甫");
        names.add("白居易");
        names.add("李清照");
        names.add("陆游");
        names.add("贺知章");
        gender.add("男");
        gender.add("女");
        gender.add("男");
        gender.add("女");
        gender.add("男");
        gender.add("男");
        address.add("吉林省长春市");
        address.add("江苏省南京市");
        address.add("江苏省苏州市");
        address.add("吉林省吉林市");
        address.add("江苏省南京市");
        address.add("上海市");
        idNumber.add("T1032");
        idNumber.add("C1048");
        idNumber.add("C1052");
        idNumber.add("T1035");
        idNumber.add("C1066");
        idNumber.add("C1088");
        wage.add(10000);
        wage.add(12000);
        wage.add(15000);
        wage.add(14000);
        wage.add(20000);
        wage.add(16000);
        workYear.add("2021-12-20");
        workYear.add("2017-10-10");
        workYear.add("2019-05-22");
        workYear.add("2015-04-12");
        workYear.add("2009-06-15");
        workYear.add("2012-03-30");
        age.add(25);
        age.add(30);
        age.add(28);
        age.add(31);
        age.add(40);
        age.add(35);


    }
}