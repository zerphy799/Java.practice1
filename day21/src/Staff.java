import java.util.ArrayList;
import java.util.List;

public class Staff {
    private String name;
    private int age;
    private String gender;
    private String department;
    private String id;
    private int wage;
    private String workYear;

    public Staff(int age, String department, String gender, String id, String name, int wage, String workYear) {
        this.age = age;
        this.department = department;
        this.gender = gender;
        this.id = id;
        this.name = name;
        this.wage = wage;
        this.workYear = workYear;
    }

    public static List<Staff> getStaff() {
        List<Staff> list = new ArrayList<>();
        list.add(new Staff(29, "研发部", "男", "Y1012", "李白", 12000, "2016-10-10"));
        list.add(new Staff(28, "产品部", "男", "C2404", "杜甫", 14000, "2017-09-05"));
        list.add(new Staff(27, "研发部", "男", "Y1035", "白居易", 11000, "2018-05-21"));
        list.add(new Staff(29, "研发部", "男", "Y1089", "李商隐", 15000, "2016-03-19"));
        list.add(new Staff(24, "产品部", "女", "C2675", "李清照", 8000, "2021-07-16"));
        list.add(new Staff(32, "项目部", "男", "X3021", "陆游", 18000, "2014-12-20"));
        return list;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    public String getWorkYear() {
        return workYear;
    }

    public void setWorkYear(String workYear) {
        this.workYear = workYear;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", wage=" + wage +
                ", department='" + department + '\'' +
                ", workYear='" + workYear + '\'' +
                '}';
    }

}
