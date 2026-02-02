import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class HomeWork1 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<Team> teamClass = Team.class;
        Team team = teamClass.getConstructor().newInstance();
        Field[] declaredFields = teamClass.getDeclaredFields();
        for (Field field : declaredFields) {
            field.setAccessible(true);
            Anno teamName = field.getDeclaredAnnotation(Anno.class);
           field.setAccessible(true);
           field.set(team, teamName.value());
        }
        System.out.println(team);
    }
}
