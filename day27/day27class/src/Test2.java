import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test2 {
    public static void main(String[] args) {
        ExecutorService executor= Executors.newFixedThreadPool(1);
        for (int i = 1; i <= 20; i++) {
            int finalI = i;
            executor.execute(()-> System.out.println("线程"+ finalI +Thread.currentThread().getName()));
        }
        executor.shutdown();
    }
}
