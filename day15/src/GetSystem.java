import java.util.Random;

public class GetSystem {
    public static void main(String[] args) {
        String str = System.getProperty("os.name");
        System.out.println("你的电脑系统为"+str);
        Os[] values = Os.values();
        System.out.println("下面随机生成一个系统并推荐合适的浏览器");
        int a=new Random().nextInt(2);
        switch (values[a]) {
            case Windows:
                System.out.println(values[a]+"推荐IE浏览器");
                break;
            case Linux:
                System.out.println(values[a]+"推荐Chrome浏览器");
                break;
            default:
                System.out.println("错误");
                break;
        }

    }
}
