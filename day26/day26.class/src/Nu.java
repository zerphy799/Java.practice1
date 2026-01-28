public class Nu {
    private int x=0;
    public  void decrement(){
        synchronized (this){
            x++;
        }
    }
    public synchronized void increment(){
        x--;
    }
    public int getx(){
        return x;
    }
}
