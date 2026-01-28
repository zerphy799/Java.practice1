public class HomeWork3 {
    public static void main(String[] args) {
       Thread t1= new Thread(() ->{
            System.out.println("生成超级兵");
        });
       t1.start();
        new Thread(() ->{
            try {
                t1.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("生成防御塔");
        }).start();
    }
}
