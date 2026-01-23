import java.util.Arrays;
import java.util.List;

public class TestReduceRef {
    public static void main(String[] args) {

        List<Hreo> heroList = Arrays.asList(new Hreo(10000,"亚瑟"),
                new Hreo(14000,"项羽"),
                new Hreo(5000,"小乔"));
//        Integer reduce = heroList.stream().reduce(0, (sum, hero) -> sum += hero.getBlood(), Integer::sum);
//        System.out.println(reduce);

        Integer reduce = heroList.stream().map(Hreo::getBlood).reduce(0, Integer::sum);
        System.out.println(reduce);
    }
}
