public class Work03 {
    public static void main(String[] args) {

        for (int i = 1; i < 30; i++) {
            for (int j = 1; j < 50; j++) {
                if (j + i == 50 && i * 4 + j * 2 == 120) {
                    System.out.println("有" + i + "只兔");
                    System.out.println("有" + j + "只鸡");
                    break;
                }
            }

        }
    }
}
