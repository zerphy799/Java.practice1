public class HomeWork5 {
    static int a=0;
    static int b=0;
    static int c=0;
    final static Object lock = new Object();
    public static void main(String[] args) {
    Thread s1 = new Thread(()->{
            synchronized (lock) {
                while (true) {
                    News news = new News();
                    news.setTitle("1234");
                    a++;
                    if (a == 2) {
                        System.out.println("线程1信息已满");
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            }

    });
        Thread s2 = new Thread(()->{
            synchronized (lock) {
                while (true) {
                    News news = new News();
                    news.setTitle("1234");
                    b++;

                    if (b == 2) {
                        System.out.println("线程2信息已满");
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            }

        });
        Thread s3 = new Thread(()->{
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (lock) {
                while (true) {
                    News news = new News();
                    news.setTitle("1234");
                    c++;



                    if (c == 2) {
                        System.out.println("线程3信息已满");
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            }

        });

    Thread t1=new Thread(()->{
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }while(true){
        synchronized (lock) {
            if(a==0||b==0||c==0) {
                try {
                    lock.wait(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }else   {
                try {
                    Thread.sleep(a*1000);
                    a=0;
                    System.out.println("读取线程1的信息");
                    Thread.sleep(b*1000);
                    b=0;
                    System.out.println("读取线程2的信息");
                    Thread.sleep(c*1000);
                    c=0;
                    System.out.println("读取线程3的信息");
                    lock.notifyAll();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        }
    });
    s1.start();
    s2.start();
    s3.start();
    t1.start();
    }



    static class News{
        ThreadLocal<String> title = new ThreadLocal<>();

        public String getTitle() {
           return title.get();
        }

        public void setTitle(String title) {
            this.title.set(title);
        }
    }
}
