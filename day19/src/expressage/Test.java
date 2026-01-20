package expressage;

import java.util.ArrayDeque;
import java.util.Queue;

public class Test {
    public static void main(String[] args) {
        Compony compony=new Compony(getDefaultProcess());
        compony.setCompletedProcess(new ArrayDeque());
        compony.setNumber("JD123456");
        Courier.doProcess(compony);
        Courier.doProcess(compony);
        Couster.search(compony);

    }
    public static Queue getDefaultProcess(){
        Queue queue = new ArrayDeque();
        queue.add("商品已出库");
        queue.add("上门收取快递");
        queue.add("送到快递中心");
        queue.add("货物运输途中");
        queue.add("货物已由快递员送货到小区分配中心");
        queue.add("货物已被收取");
        return queue;
    }
}
