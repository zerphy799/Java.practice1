public class Test02 {
    public static void main(String[] args) {
        System.out.println("主线程开始");
        new Thread(()->{while(true){
            System.out.println("Hello World");
            try{Thread.sleep(2000);}catch(Exception e){
               e.printStackTrace();     }
       }}).start();



        System.out.println("线程结束");
    }
}
