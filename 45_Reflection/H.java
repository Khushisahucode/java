import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
public class H {
     public static void main(String[]args){
        Class klass=Employee.class;
        Field[] x=klass.getFields();
        for(Field next:x)
        System.out.println(Modifier.toString(next.getModifiers())+"......"+next.getName());
    }
}
// public......name
// public final......age
// public......u2