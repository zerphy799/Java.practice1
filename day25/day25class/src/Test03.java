import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class Test03 {
    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
        FutureTask<Integer> futureTask = new FutureTask<Integer>(()->{
            int value=0;
            Thread.sleep(2000);
            while (value<10) {
                value++;
            }return value;
        });
        new Thread(futureTask).start();
        Thread.sleep(1000);
       // futureTask.cancel(true);
        System.out.println(futureTask.isCancelled());
        System.out.println(futureTask.isDone());
        System.out.println(futureTask.get(1100, TimeUnit.MILLISECONDS));
    }
}
