import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class HomeWork3 {
    public static void main(String[] args) {
        UnaryOperator<List<Integer>> unaryOperator=(List<Integer> a)->{
          List<Integer> c=new ArrayList<>();
            for (Integer i : a) {
                if(i%2==0){
                    c.add(i);
                }
            }
            return c;
        };
        UnaryOperator<List<Integer>> function=(List<Integer> b)->{
            for (int i = 0; i < 10; i++) {
                b.add((int) (Math.random()*100));
            }
            return b;
        };
        List<Integer> b=new ArrayList<>();

        System.out.println(function.apply(b));
        System.out.print("过滤后为");
        System.out.println(unaryOperator.apply(function.apply(b)));
    }
}
