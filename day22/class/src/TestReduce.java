import java.util.stream.Stream;

public class TestReduce {
    public static void main(String[] args) {
//        int sum = Stream.of(1, 2, 3, 4, 5).mapToInt(Integer::intValue).sum();
//        System.out.println(sum);
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
      /*  Optional<Integer> reduce = stream.reduce((x,y)->x+y);
        System.out.println(reduce.get());
        */
//        Integer reduce = stream.reduce(0,Integer::sum);
//        System.out.println(reduce);
//         Integer reduce= stream.reduce(1,(x,y)->x*y);
//        System.out.println(reduce);
        Integer reduce = stream.reduce(0, (x, y) -> x > y ? x : y);
        System.out.println(reduce);

    }
}
