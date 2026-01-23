import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestSorted {
    public static void main(String[] args) {
        List<Staff> list = Arrays.asList(
                new Staff(22,"李白",10000),
                new Staff(28,"杜甫",12000),
                new Staff(25,"白居易",15000)
                );
        Collections.sort(list);
        list.forEach(System.out::println);
        System.out.println("--------------------");
         list.stream().filter(s -> s.getSal() >= 12000).sorted().forEach(System.out::println);
    }
}
