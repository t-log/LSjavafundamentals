package example2;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.TYPE,ElementType.CONSTRUCTOR})
public @interface MyAnnotation {
    int m(); //Laur mentioned this as a property
}
