import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class Test4 {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executor= Executors.newFixedThreadPool(3);
        List<Callable<String>> list= Arrays.asList(
                () -> {
                    System.out.println("执行任务1");
                    return "aa";
                },
                ()->{
                    System.out.println("执行任务2");
                    return "bb";
                },
                ()->{
                    System.out.println("执行任务3");
                    return "cc";
                }
        );
        List<Future<String>> futures =executor.invokeAll(list);
        for (Future<String> future : futures) {
            System.out.println(future.get());
        }
        executor.shutdown();
    }
}
