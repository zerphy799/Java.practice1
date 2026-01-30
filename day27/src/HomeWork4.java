import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class HomeWork4 {
    static int count=10;
    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();
        for (int i = 1; i <= 30; i++) {
            int finalI = i;
            executor.execute(()->{
                if(count>0) {
                    System.out.println("乘客" + finalI + "抢到了一张车票还剩" + --count + "张");
                }
                });
            if (count==0){
              break;
            }
        }
         executor.shutdown();

    }
}
