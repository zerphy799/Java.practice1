import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class HomeWorkUtil {
    public static Object getReturn(String className, String methodName, Object[] args, Class<?>... params) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> clazz= Class.forName(className);
        Method method = clazz.getDeclaredMethod(methodName, params);
         method.setAccessible(true);
        Object object = clazz.getConstructor().newInstance();
          return method.invoke(object,args);
    }
    public static Object getobj(String className,String file,Object value) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Class<?> clazz=Class.forName(className);
        Object object = clazz.getConstructor().newInstance();
        Field field = clazz.getDeclaredField(file);
        field.setAccessible(true);
        field.set(object,value);
        return object;
    }
    public static Object setobj(String className,String[] file,Object[] values) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Class<?> clazz=Class.forName(className);
        Object object = clazz.getConstructor().newInstance();
        int i=0;
        for (String s : file) {
            Field field = clazz.getDeclaredField(s);
            field.setAccessible(true);
            field.set(object,values[i]);
            i++;
        }
        return object;
    }
}
