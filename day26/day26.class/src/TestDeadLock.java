public class TestDeadLock {
    public static void main(String[] args) {
        Object pen=new Object();
        Object paper=new Object();
        new Thread(()->{
            synchronized (pen){
                System.out.println("拿到了笔");
                synchronized (paper){
                    System.out.println("拿到了纸");
                }
            }
        }).start();
        new Thread(()->{
            synchronized (paper){
                System.out.println("拿到了纸");
                synchronized (pen){
                    System.out.println("拿到了笔");
                }
            }
        }).start();

    }
}
