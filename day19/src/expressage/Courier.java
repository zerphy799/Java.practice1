package expressage;

import java.util.ArrayDeque;
import java.util.Queue;

public class Courier {
    public static void doProcess(Compony compony)
    {
        Queue queue = new ArrayDeque(compony.getDefaultProcess());
        Queue queue2 = new ArrayDeque();
        queue2.add(queue.poll());
        compony.setCompletedProcess(queue2);

    }
}
