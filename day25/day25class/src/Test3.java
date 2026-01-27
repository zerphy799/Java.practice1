public class Test3 {
    public static void main(String[] args) {
        Thread t = new Thread(()->{
            int x=0;
            while(true){
                System.out.println("线程1"+x++);
            }
        },"t1");
        t.start();
       Thread t2 = new Thread(()->{
           int x=0;
           while(true){

               Thread.yield();
               System.out.println("线程2"+x++);
           }
       });
       t2.start();
    }
}
