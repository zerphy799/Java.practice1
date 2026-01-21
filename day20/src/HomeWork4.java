import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public class HomeWork4 {
    public static void main(String[] args) {
        BiFunction<String,Integer,Student> biFunction= Student::new;
        Student student1=biFunction.apply("张三",25);
        Student student2=biFunction.apply("李三",28);
        Student student3=biFunction.apply("陈三",19);
        List<Student> students= Arrays.asList(student1,student2,student3);
        students.sort((o1, o2) -> {
            int a=o1.getAge();
            int b=o2.getAge();
            return Integer.compare(a,b);
        });
        System.out.println(students);
    }
}
