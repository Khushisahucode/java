import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
public class I {
     public static void main(String[]args){
        Class klass=student.class;
        Field[] x=klass.getFields();
        for(Field next:x)
        System.out.println(Modifier.toString(next.getModifiers())+"......"+next.getName()+ "..."+next.getType());
    }
}
//public......marks...int
//public......age...int