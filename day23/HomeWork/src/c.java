import java.util.Arrays;

public class c {
    public static void main(String[] args) {

       String a ="李白 王安石 杜甫 张居正";
       String b ="王安石 张居正 李白";
        String[] strings = a.split(" ");
        String[] strings1 = b.split(" ");
        Arrays.stream(strings).sorted().forEach(System.out::println);
        Arrays.stream(strings1).sorted().forEach(System.out::println);
    }
}
