import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class Test01 {
    public static void main(String[] args) throws InterruptedException {
        ReentrantLock lock = new ReentrantLock();
        Thread t1=new Thread(()->{
            try {
                lock.lock();
                System.out.println("线程1获取到锁");
            }finally {
                lock.unlock();
            }

        });
        t1.start();
        Thread t2=new Thread(()->{
            try {
                TimeUnit.MILLISECONDS.sleep(3000);
            } catch (InterruptedException e) {
             //  e.printStackTrace();
                System.out.println("线程2被打断");
                return;
            }
            try {
                System.out.println("线程2尝试获取锁");
                lock.lockInterruptibly();
            } catch (InterruptedException e) {
                System.out.println("线程2被打断");
                return;
            }
            try {
                System.out.println("线程2获取到锁");
            }finally {
                lock.unlock();
            }
        });
        t2.start();
        TimeUnit.MILLISECONDS.sleep(1000);
        if(t2.isAlive()) {
            System.out.println("执行线程中断操作");
            t2.interrupt();
        }else{
            System.out.println("线程2执行完毕");
        }
        System.out.println(lock.isLocked());
    }
}
