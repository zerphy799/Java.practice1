import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class HomeWork2 {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();
        Condition condition = lock.newCondition();
        Fairs fair1 = new Fairs(lock);
        new Thread(fair1).start();
        new Thread(()->{
            lock.lock();
            try {
                condition.await();
            } catch (InterruptedException e) {
            }finally {
                lock.unlock();
            }
            System.out.println("个人账户积分");
        }).start();
        new Thread(()->{
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            lock.lock();
            System.out.println("使用微信付款");
            condition.signal();
            lock.unlock();
        }).start();

    }
}
class Fairs implements Runnable {
    public Fairs(ReentrantLock lock) {
    }

    @Override
    public void run() {
        System.out.println("购买商品下单");
    }
}
