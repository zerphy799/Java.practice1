public class Test {
    public static void main(String[] args) {

        ReadThread thread= new ReadThread();
        thread.start();
        new Thread(()->{FileUtil.main(args);}).start();
        System.out.println("运行主程序");
    }
   static class ReadThread extends Thread{
        @Override
        public void run() {
            System.out.println("执行线程1");
        }
    }
}
