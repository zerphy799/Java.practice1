public class Test {
    public static void main(String[] args) {
        Staff person01=new Employee01();
        Staff person02=new Employee02();
        Staff person03=new Employee03();
        Manager.dismiss(person01);
        Finance.money(person01);
        Manager.dismiss(person02);
        Finance.money(person02);
        Manager.dismiss(person03);
        Finance.money(person03);
    }
}
