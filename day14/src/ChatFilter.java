import java.util.Arrays;
import java.util.Scanner;

public class   ChatFilter {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请开始聊天，注意文明用语");
       String str=input.nextLine();
       String[] str1=new String[3];
       Arrays.fill(str1,"0");
       str1[0]="尼玛";
        str1[1]="卧槽";
        str1[2]="傻逼一个";
        String[] str2=new String[3];
        Arrays.fill(str2," ");
        for (int i = 0; i < 3; i++) {
            int a=str1[i].length();
            for (int i1 = 0; i1 < a; i1++) {
                str2[i]+="*";
            }
        }
        for(int j=0;j<str1.length;j++){
            str= str.replaceAll(str1[j],str2[j]);
        }
           System.out.println(str);
    }
}
