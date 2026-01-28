public class HomeWork2 {
    final static Object cave=new Object();
    public static void main(String[] args) {
        for (int i = 1; i < 4; i++) {
            new Thread(()-> {
                passCave();
            },"visator"+i).start();
        }

    }
    public static  void passCave(){
        synchronized(cave){
            try{
                Thread.sleep(5000);
                System.out.println(Thread.currentThread().getName()+"爬出了山洞");
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
