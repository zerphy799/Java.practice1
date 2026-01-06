public class Finance {
    public static void money(Staff staff){
        if (staff instanceof Employee01) {
            System.out.println("18000元");
        }
        else if (staff instanceof Employee02) {
            System.out.println("10000元");
        }
        else if (staff instanceof Employee03) {
            System.out.println("7000元");
        }
        else {
            System.out.println("输入错误");
        }
    }
}
