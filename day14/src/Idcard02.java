import java.util.Scanner;

public class Idcard02 {
    public static void main(String[] args) {
        StringBuffer idNumber=new StringBuffer(18);
        System.out.println("请输入身份证");
        Scanner input=new Scanner(System.in);
        idNumber.append(input.next());
        if(idNumber.length()==18){
            String str=idNumber.toString();
            boolean a=str.matches("\\d{17}[X\\d]");
            if(a==true){
                idNumber.replace(6,14,"********");
                System.out.println(idNumber);
                if(idNumber.charAt(16)%2==0){
                    System.out.println("女士");
                }
                else{
                    System.out.println("男士");
                }
            }
            else{
                System.out.println("格式错误");
            }
        }
        else{
            System.out.println("长度错误");
        }
    }
}
