import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class HomeWork1 {
    static int sum=0;
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        FutureTask<Integer> f1 = new FutureTask<>(() -> {

            for (int i = 1; i <= 500; i++) {
                sum += i;
            }
            return sum;
        });
        new Thread(f1).start();

        FutureTask<Integer> f2 = new FutureTask<>(() -> {
            Thread.sleep(1200);
            int sum = f1.get();
            for (int i = 501; i <= 1000; i++) {
                sum += i;
            }
            return sum;
        });
        new Thread(f2).start();
        System.out.println(f2.get());
    }
}
