import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class HomeWork3 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        ArrayList<String> arrayList = new ArrayList<>();
        Class<? extends ArrayList> aClass = arrayList.getClass();
        Method add = aClass.getDeclaredMethod("add",Object.class);
        add.setAccessible(true);
        Object invoke = add.invoke(arrayList,1);
        System.out.println(invoke);
        System.out.println(arrayList);
    }
}
