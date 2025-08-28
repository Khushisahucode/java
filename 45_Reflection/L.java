import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
public class L {
     public static void main(String[]args){
        Class klass=student3.class;
        Class s1=klass.getSuperclass();
        Field[] s2=s1.getDeclaredFields();
        for(Field next:s2)
        System.out.println(Modifier.toString(next.getModifiers())+"......"+next.getName()+"  type : "+ next.getType());
   
    }
}
// ......name  type : class java.lang.String
// public......age  type : int
// static......password  type : class java.lang.String
// private......phno  type : int