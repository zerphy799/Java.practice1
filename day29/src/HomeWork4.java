import java.lang.reflect.InvocationTargetException;

public class HomeWork4 {
    public static void main(String[] args) throws NoSuchFieldException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {

        Object aReturn = HomeWorkUtil.getReturn("HomeWork4", "test", new Object[]{10, 2}, int.class, int.class);
        System.out.println(aReturn);
        Object getobj = HomeWorkUtil.getobj("Student", "name", "李白");
        System.out.println(getobj);
        Object student = HomeWorkUtil.setobj("Student", new String[]{"name", "gender", "age"}, new Object[]{"李白", "男", 22});
        System.out.println(student);
    }

    public int test(int a, int b) {
        return a + b;
    }

}
