public class Work05 {
    public static void main(String[] args){
        for(int i=4;i<=100;i++){
            int a=0;
            int[] num;
            num=new int[20];
            for(int j=1;j<i;j++){
                if(i%j==0){
                    num[a++]=j;
                }
            }
            int sum=0;
            for(int t=0;t<a;t++){
                sum+=num[t];
            }
            if(sum==i){
                System.out.println(i);
            }
        }
    }
}
