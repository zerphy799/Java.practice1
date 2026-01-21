import java.util.function.BiFunction;

public class HomeWork1 {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> add = Integer::sum;
        System.out.println(add.apply(5, 2));
    }
}
