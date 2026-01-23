import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TestCollectClau {

    public static void main(String[] args) {
        List<Emp> list = Arrays.asList(new Emp(22,"李白",12000),
                new Emp(28,"杜甫",10000),
                new Emp(25,"白居易",11000),
                new Emp(24,"李贺",8000));
        //统计人数
        Long collect = list.stream().filter(e -> e.getName().startsWith("李")).collect(Collectors.counting());
       //替换方法
        long count = list.stream().filter(e -> e.getName().startsWith("李")).count();
        System.out.println(collect);
        System.out.println(count);
        Optional<Emp> collect1 = list.stream().filter(e -> e.getSal() >= 10000).collect(Collectors.maxBy(Comparator.comparing(Emp::getSal)));
        System.out.println(collect1.get());
        //可以替换
        Optional<Emp> max = list.stream().filter(e -> e.getSal() >= 10000).max(Comparator.comparing(Emp::getSal));
        System.out.println(max.get());

    }}
