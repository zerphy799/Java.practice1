import java.util.ArrayList;
import java.util.List;

public class StaffInformation {
    private String name;
    private String idnumber;
    private String  address;
    private String  workYear;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String  gender;
    private int  wage;
    private int  age;
     public static List<StaffInformation> staff = new ArrayList<>();
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdnumber() {
        return idnumber;
    }

    public void setIdnumber(String idnumber) {
        this.idnumber = idnumber;
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

    public StaffInformation(String address, String idnumber, String gender, String name, int age, int wage, String workYear) {
        this.address = address;
        this.idnumber = idnumber;
        this.gender = gender;
        this.name = name;
        this.wage = wage;
        this.workYear = workYear;
        this.age = age;
    }

  public static List<StaffInformation> getStaff() {
      staff.add(new StaffInformation("吉林省长春市","T1032","男","李白",25,10000,"2021-12-20"));
      staff.add(new StaffInformation("江苏省南京市","C1048","女","杜甫",30,12000,"2017-10-10"));
      staff.add(new StaffInformation("吉林省长春市","C1052","男","白居易",28,15000,"2019-05-22"));
      staff.add(new StaffInformation("吉林省长春市","T1035","女","李清照",31,14000,"2015-04-12"));
      staff.add(new StaffInformation("吉林省长春市","C1066","男","陆游",40,20000,"2019-05-22"));
      staff.add(new StaffInformation("吉林省长春市","C1088","男","贺知章",35,16000,"2012-03-30"));
      return staff;
  }

    public StaffInformation() {
    }

    @Override
    public String toString() {
        return "staffInformation{" +
                 idnumber + '\'' +
                 name + '\'' +
               gender + '\'' +
                 age +" "+
                 workYear + '\'' +
                wage +
                address + '\'' +
                '}';
    }
}
