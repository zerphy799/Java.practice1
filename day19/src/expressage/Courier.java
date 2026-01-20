package expressage;

import java.util.ArrayDeque;
import java.util.Queue;

public class Courier {
    public static void doProcess(Compony compony)
    {
        Queue queue2 = new ArrayDeque();
        queue2.add(compony.getDefaultProcess().poll());
        compony.setCompletedProcess(queue2);

    }
}
