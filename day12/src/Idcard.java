import java.util.Scanner;

public class Idcard {
    public static void main(String[] args) {
        System.out.println("欢迎入住汉庭酒店，请输入你的身份证");
        String idNumber;
        Scanner input = new Scanner(System.in);
        idNumber = input.nextLine();
       String fix="123456";
       if(idNumber.equals(fix)){
           try{
               throw new Idnumber ();
           }catch(Idnumber e){
              e.printStackTrace();
           }
       }
       else{
           System.out.println("欢迎入住");
       }
    }
}
