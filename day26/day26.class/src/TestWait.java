public class TestWait {
    static final Object lock = new Object();
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(()-> {
            System.out.println("线程1进行中");
            synchronized (lock) {
                try {
                    lock.wait(2000);
                    System.out.println("线程1被唤醒");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        Thread t2 = new Thread(()-> {
            System.out.println("线程2进行中");
            synchronized (lock) {
                try {
                    lock.wait(2000);
                    System.out.println("线程2被唤醒");
                } catch (InterruptedException e) {}
            }
        });
        t1.start();
        t2.start();
        Thread.sleep(1000);
        synchronized (lock) {
            System.out.println("主线程开始唤醒");
            lock.notify();
        }
    }
}
