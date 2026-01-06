import java.util.Scanner;

public class IdCard01 {
    public static void main(String[] args) {
        String idNumber;
        System.out.println("请输入身份证号码");
        Scanner sc = new Scanner(System.in);
        idNumber = sc.nextLine();
        int number=0;

        for (int i = 0; i < idNumber.length(); i++) {
            boolean b=Character.isDigit(idNumber.charAt(i));
            if(b==true){
                number=number+1;
            }
        }
        if(idNumber.length()==18){
        if(idNumber.charAt(17)=='X'||Character.isDigit(idNumber.charAt(17))){
            if(number==17){
                System.out.println("身份证正确");
                System.out.println(idNumber.substring(0,6)+"********"+idNumber.substring(14));
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
            System.out.println("格式错误");
        }
        }else{
            System.out.println("长度错误");
        }
    }
}
