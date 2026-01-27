public class HomeWork2 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(()->{
            int i=0;
            while(i<=100){
              int a=(int)(Math.random()*2+1);
                i+=a;
            }
        });
        t1.start();
        Thread t2 = new Thread(()->{
            int j=0;
            while(j<=100){
                int a=(int)(Math.random()*2+3);
                j+=a;
                if(j>=70){
                    try {
                        Thread.sleep(2);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });
        t2.start();
        Thread.sleep(5);
       if(t1.isAlive()){
           if(!t2.isAlive()){
               System.out.println("兔子获胜");
           }
       }
       if(t2.isAlive()){
           if(!t1.isAlive()){
               System.out.println("乌龟获胜");
           }
       }

    }

}
