import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
public class U {
     public static void main(String[]args)throws IllegalAccessException{
        Class klass=Teacher3.class;
       
        Method[] arr=klass.getDeclaredMethods();
       
        for(Method next:arr){
            String modname=Modifier.toString(next.getModifiers());
            String methodname=next.getName();
            String returntype=next.getReturnType().getName();
            int parametrecount=next.getParameterCount();
        System.out.println(modname+" "+ returntype+" "+methodname + "..........."+parametrecount);
       
        }
            
        }
    }
//     static final void add...........3
// public static float write...........0
// final User cook...........2
// public synchronized java.lang.String go...........2