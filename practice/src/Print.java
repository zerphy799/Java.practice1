public class Print {
    public static void main(String[] args) {
        int num, a = 0;
        int[] num1 = new int[6];

        for (num = 1; num <= 1000; num++) {
            if (num % 5 != 0) {
                if (num / 100 != 5 && num % 100 / 10 != 5 && num % 100 % 10 != 5) {
                    num1[a++] = num;
                }
            }
            if (a == 6) {
                for (int i : num1) {
                    System.out.print(i+"\t");
                }
                System.out.println();
                a=0;
            }

        }
    }

}

