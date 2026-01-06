import java.util.Timer;
import java.util.TimerTask;

public class IntermittentPrint {
    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println((int)(Math.random()*1000));
            }
        },0,2000);
    }
}
