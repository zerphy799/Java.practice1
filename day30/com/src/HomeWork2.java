import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Proxy;

public class HomeWork2 {
    public static void main(String[] args) throws NoSuchFieldException {
        Class<User> userClass = User.class;
        Field field = userClass.getDeclaredField("name");
        field.setAccessible(true);
        Annotation declaredAnnotation = field.getDeclaredAnnotation(passWord.class);
        String str =declaredAnnotation.toString();
       String str1=str.substring(1, str.indexOf(","));
        String str2=str.substring(str.indexOf(",")+1);
      String password = str1.substring(str1.indexOf("\"")+1, str1.lastIndexOf("\""));
      String name = str2.substring(str2.indexOf("\"")+1, str2.lastIndexOf("\""));
        User user =new User(name,password);
        Object object = Proxy.newProxyInstance(user.getClass().getClassLoader(), user.getClass().getInterfaces(), new MyHandler(user));
        logIn o= (logIn) object;
        o.logIn();
    }
}
