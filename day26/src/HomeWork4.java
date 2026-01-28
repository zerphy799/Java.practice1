public class HomeWork4 {
    final static Object lock = new Object();
    public static void main(String[] args) {
        Thread t1= new Thread(() ->{
            synchronized (lock) {
                int a=0;
                while (a<5){
                    System.out.println("生成超级兵");
                    a++;
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });
        Thread t2= new Thread(() ->{
            synchronized (lock) {
                int b=0;
                while (b<5){
                    System.out.println("超级兵移动");
                    b++;
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });
        Thread t3= new Thread(() ->{
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (lock) {
                int c=0;
                while (c<5){
                    System.out.println("超级兵攻击防御塔");
                    c++;
                    lock.notifyAll();
                    try {
                        lock.wait(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });
        t1.start();
        t2.start();
        t3.start();

    }
}
