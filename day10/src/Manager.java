public class Manager {
    public static void dismiss(Staff staff) {

         if (staff instanceof Employee01) {
            System.out.println(((Employee01) staff).getName()+",因为代码出现Bug，后来因为程序员比较难招聘，所以给一次机会");
        }
        else if (staff instanceof Employee02) {
            System.out.println(((Employee02)staff).getName()+",因为Bug未测试出来");
        }
        else if (staff instanceof Employee03) {
            System.out.println(((Employee03)staff).getName()+",因为设计不合理");
        }
        else {
             System.out.println("输入错误");

         }
    }
}
