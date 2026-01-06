import java.util.Arrays;
import java.util.Scanner;

public class Judge {
    public static void main(String[] args) {
        String str;
        Scanner sc=new Scanner(System.in);
        str=sc.nextLine();
        judge(str);
    }
    public static void judge(String str){
        String str1="美国";
        String str2="中国";
        String str3="法国";
        String str4="英国";
        String str5="俄罗斯";
        int i= Arrays.compare(str.toCharArray(),str1.toCharArray());
        int j= Arrays.compare(str.toCharArray(),str2.toCharArray());
        int k= Arrays.compare(str.toCharArray(),str3.toCharArray());
        int l= Arrays.compare(str.toCharArray(),str4.toCharArray());
        int m= Arrays.compare(str.toCharArray(),str5.toCharArray());
        if(i==0||j==0||k==0||l==0||m==0){
            System.out.println(str+"是常任理事国");
        }
        else{
            System.out.println(str+"不是常任理事国");
        }
        return ;
    }
}
