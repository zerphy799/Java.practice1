public class Test {
    public static void main(String[] args) {
       // CallNumber ber=new CallNumber();
         String[] str=new String[4];
        for (int i = 0; i < 4; i++) {
            int a=(int)(Math.random()*1000);
            str[i]= CallNumber.getPhoneNumber().get(a).toString();
        }
        System.out.println("中奖号码为");
        for (int i = 0; i < 4; i++) {
            String a=str[i];
            System.out.println(a.substring(0,3)+"****"+a.substring(7));

        }

    }
}
