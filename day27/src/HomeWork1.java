import java.util.concurrent.locks.ReentrantLock;

public class HomeWork1 {
    public static void main(String[] args) {
        ReentrantLock reentrantLock = new ReentrantLock(true);
         Fair fair=new Fair(reentrantLock);
         new Thread(fair).start();
        Thread t2 = new Thread(()->{
            reentrantLock.lock();
            System.out.println("攻击防御塔");
            reentrantLock.unlock();
        });
        t2.start();

    }
}
class Fair implements Runnable{
    private ReentrantLock lock;
    public Fair(ReentrantLock lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        System.out.println("生产超级兵");
    }
}
