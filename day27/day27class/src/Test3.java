import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test3 {
    public static void main(String[] args) {
        ExecutorService executor= Executors.newCachedThreadPool();
        for (int i = 0; i < 20; i++) {
            int finalI = i;
            executor.execute(()->{
                    System.out.println("生产产品"+finalI);

            });

        }
        executor.shutdown();
    }
}
