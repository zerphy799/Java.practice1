import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class HomeWork2 {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        FutureTask<Long> task1= new FutureTask<>(() -> {
            long l = System.currentTimeMillis();
            int i = 0;
            while (i <= 100) {
                int a = (int) (Math.random() * 2 + 1);
                i += a;
            }
            long l1 = System.currentTimeMillis();
            return l1 - l;
        });
        new Thread(task1).start();
       FutureTask<Long> task2=new FutureTask<>(()->{
           long l = System.currentTimeMillis();
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
            long l1 = System.currentTimeMillis();
            return l1-l;
       });
        new Thread(task2).start();
        Thread.sleep(5);
          if(task1.get()>task2.get()) {
              System.out.println("兔子获胜");
          }
           else {
              System.out.println("乌龟获胜");
          }

    }

}
