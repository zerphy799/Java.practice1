import java.lang.annotation.*;

@Documented
@Target(value = {ElementType.FIELD, ElementType.TYPE,ElementType.PACKAGE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Anno {
    String value();
}
