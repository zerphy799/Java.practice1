public class Work02 {
    public static void main() {
     int num;
     for(int i=1;i<3;i++){
         for(int j=1;j<3;j++){
             for(int k=1;k<3;k++){
                 int i1=i*i*i;
                 int j1=j*j*j;
                 int k1=k*k*k;
                 num=i1*100+j1*10+k1;
                 System.out.println(num);
             }
         }
     }
    }
}
