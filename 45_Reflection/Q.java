import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
public class Q {
     public static void main(String[]args)throws IllegalAccessException{
        Class klass=Teacher3.class;
       
        Method[] arr=klass.getDeclaredMethods();
       
        for(Method next:arr){
            String modname=Modifier.toString(next.getModifiers());
            String methodname=next.getName();
            Class returntype=next.getReturnType();
        System.out.println(modname+" "+ returntype+" "+methodname );
       
        }
            
        }
    }
//     final class User cook
// static final void add
// public static float write