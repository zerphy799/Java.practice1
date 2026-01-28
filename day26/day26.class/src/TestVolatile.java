public class TestVolatile {
  volatile static boolean b = true;
    public static void main(String[] args) throws InterruptedException {
        new Thread(()-> {
            while (b){
              //  System.out.println("g");
            }
        }).start();
        Thread.sleep(1000);
        System.out.println("主线程将t1关闭");
        b=false;
    }
}
