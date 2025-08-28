import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
public class M {
     public static void main(String[]args){
        Class klass=student3.class;
        
        Field[] s2=klass.getDeclaredFields();
        for(Field next:s2)
        System.out.println(Modifier.toString(next.getModifiers())+"......"+next.getName()+"  type : "+ next.getType());
   
    }
}
// final......id  type : class java.lang.String
// protected......cgpa  type : float
// public......marks  type : int
// ......name  type : class java.lang.String
// public......age  type : int
// static......password  type : class java.lang.String
// private......phno  type : int