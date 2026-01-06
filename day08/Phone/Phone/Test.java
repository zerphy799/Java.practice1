public class Test {
    public static void main(String[] args) {
        PhoneBasic phone1 = new PhoneBasic();
        PhoneBasic phone2 = new PhoneBasic();
        phone1.setColor("黑色");
        phone2.setColor("白色");
        phone1.setBrand("华为");
        phone2.setBrand("荣耀");
        phone1.setModel("Mate40");
        phone2.setModel("V70");
        phone1.setWight(200);
        phone2.setWight(189);

        System.out.println(phone1.getColor()+phone1.getBrand()+phone1.getModel()+"重量为"+phone1.getWight());
        phone1.Calling();
        System.out.println(phone2.getColor()+phone2.getBrand()+phone2.getModel()+"重量为"+phone2.getWight());
        phone2.Message();
    }
}
