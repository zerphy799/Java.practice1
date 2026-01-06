public class Work04 {
    public static void main(String[] args){
        for(int i=2;i<=100;i++){
            int a=1;
          for(int j=2;j<i;j++){
              if(i%j==0) {
                  a = 0;
                  break;
              }
          }
          if(a==1){
              System.out.println(i);
          }

        }
    }
}
