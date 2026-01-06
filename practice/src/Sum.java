public class Sum {
    public static void main(String[] args) {
        int num ;
        int[] value = new int[50];
        int a = 0;
        for (num = 10; num <= 100; num++) {
            if (num % 2 != 0) {
                value[a++] = num;
            }

        }
        for (int i=0;i<a;i++) {
            System.out.print(value[i]+"\t");
            if(i%10==0){
                System.out.println( );
            }
        }
        System.out.println("\n"+(a+1));
    }
}
