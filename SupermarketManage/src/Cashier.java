import java.util.ArrayList;
import java.util.List;

public class Cashier {
    private String id;
    private String account;
    private String password;
    private String gender;
    private String age;
    private String name;
    private String phone;
    private String address;

    public static List<Cashier> cashiers = new ArrayList<>();
    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return  id + "  " + account + "  " + password + "     " +
                 age +"     " +gender + "        " + name + "  " + address + " " +
                "  " + phone
              ;
    }

    public Cashier(String id,String account, String address, String age, String gender, String name, String password, String phone) {
        this.account = account;
        this.address = address;
        this.age = age;
        this.gender = gender;
        this.id = id;
        this.name = name;
        this.password = password;
        this.phone = phone;
    }

    public static List<Cashier> getCashiers() {
        return cashiers;
    }
    public static boolean setCashier(String account, String address, String age, String gender, String id, String name, String password, String phone) {
        boolean matches = age.matches("^(?:1[89]|[2-9]\\d)$");
        boolean matches1 = phone.matches("^1\\d{10}$");
        if(!matches1){
            System.out.println("电话号码错误");
            return false;
        }
        if(!matches){
            System.out.println("年龄不符合规范");
            return false;
        }
        for (Cashier cashier : Cashier.cashiers) {
            if (cashier.getId().equals(id)||cashier.getAccount().equals(account)||cashier.getPassword().equals(password)) {
                System.out.println("收银员重复,请重新确认后再进行设置");
                return false;
            }
        }
        Cashier cashiers = new Cashier(id, account, address, age, gender, name, password, phone);
        Cashier.cashiers.add(cashiers);
        System.out.println("添加成功");
        return true;
    }
    public static boolean deleteCashier(String id) {
        for (Cashier cashier : Cashier.cashiers) {
            if (cashier.getId().equals(id)) {
                Cashier.cashiers.remove(cashier);
                System.out.println("删除成功");
                return true;
            }
        }
        System.out.println("没有找到,请重新确认后再设置");
      return false;
    }
    public static void createCashiers(){
        Cashier.cashiers.add(new Cashier("1","8274619053","浙江省杭州市华星时代广场1期","28","男","陈浩","x8kDFg","13856924715"));
        Cashier.cashiers.add(new Cashier("2","3951746280","广东省广州市天河区汇丰据2栋","35","女","凌宇","p9Lm7eR","15987423610"));
        Cashier.cashiers.add(new Cashier("3","7418529630","江苏省南京市玄武区德基广场1期","42","女","张曼玉","s6vTbN","13698524710"));
        Cashier.cashiers.add(new Cashier("4","6325897410","四川省成都市锦江区茂业天地1号楼","24","男","刘子豪","a7dH3fk","18965412301"));
        Cashier.cashiers.add(new Cashier("5","4179362580","河南省郑州市二七区中南国际城","51","女","王秀琴","m5nG8jP","13579246803"));

    }
}
