import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class Homework2 {
    public static void main(String[] args) {
        UnaryOperator<List<Integer>> function=(List<Integer> b)->{
            for (int i = 0; i < 10; i++) {
                b.add((int) (Math.random()*100));
            }
            return b;
        };
       List<Integer> b=new ArrayList<>();

        System.out.println(function.apply(b));
    }
}
