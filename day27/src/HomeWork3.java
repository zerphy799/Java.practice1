import java.util.concurrent.locks.LockSupport;

public class HomeWork3 {
    public static void main(String[] args) {
       Thread t3=new Thread(()-> {
           LockSupport.park();
           System.out.println("个人账户积分");
       });

       Thread t2= new Thread(()->{
           LockSupport.park();
           System.out.println("使用微信付款");
           LockSupport.unpark(t3);
       });
        Thread t1= new Thread(()->{
            System.out.println("购买商品下单");
            LockSupport.unpark(t2);
        });
        t1.start();
        t2.start();
        t3.start();
    }
}
