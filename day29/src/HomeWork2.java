import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ResourceBundle;

public class HomeWork2 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, ClassNotFoundException {
        ResourceBundle rb = ResourceBundle.getBundle("value");
        String name = rb.getString("name");
        String gender = rb.getString("gender");
        int  age = Integer.parseInt(rb.getString("age"));
        Class<?> clazz = Class.forName("com.coder.test.Student");
        Object object = clazz.getConstructor().newInstance();
        Method method = clazz.getDeclaredMethod("setgender", String.class);
        method.setAccessible(true);
        method.invoke(object, gender);
        clazz.getDeclaredMethod("setname", String.class).invoke(object, name);
        clazz.getDeclaredMethod("setage", int.class).invoke(object, age);
        com.coder.test.Student student = (com.coder.test.Student) object;
        System.out.println(student);
    }
}
