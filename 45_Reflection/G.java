import java.lang.reflect.Field;
public class G {
     public static void main(String[]args){
        Class klass=Employee.class;
        Field[] x=klass.getFields();
        for(Field next:x)
        System.out.println(next.getName());
    }
}//name
//age
//u2