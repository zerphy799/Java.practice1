public class HomeWork1 {
   static final Object student=new Object();
    public static void main(String[] args) {

        Thread t1= new Thread(()->{
            System.out.println("学生睡觉中");
            synchronized (student) {
                try {
                    student.wait(3000);
                    System.out.println("学生被吵醒");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        Thread t2= new Thread(()->{
            int a=0;
            while(a<3){
                System.out.println("上课");
                a++;
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            synchronized (student) {
                student.notify();
            }
        });
        t1.start();
        t2.start();
    }
}
