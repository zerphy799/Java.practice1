public class Add {
    public static void main(String[] args) {
        int [] num=new int [10];
        for (int i = 0; i < 10; i++) {
            num[i]=(int)(Math.random()*10);
        }
        for (int i : num) {
            System.out.print(i+"\t");
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            if(i%2==0){
                num[i]=num[i]+1;

            }
        }
        for (int i : num) {
            System.out.print(i+"\t");
        }
    }
}
