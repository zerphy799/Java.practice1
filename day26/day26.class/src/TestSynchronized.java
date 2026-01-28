public class TestSynchronized {
    public static void main(String[] args) throws InterruptedException {
        Nu nu=new Nu();
        Thread t1 = new Thread(()-> {
            for(int i=0;i<10;i++){
                nu.increment();
            }
            });
        Thread t2 = new Thread(()-> {
            for(int i=0;i<10;i++){
                nu.decrement();
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(nu.getx());
    }

}

