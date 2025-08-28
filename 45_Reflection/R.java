import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
public class R {
     public static void main(String[]args)throws IllegalAccessException{
        Class klass=Teacher3.class;
       
        Method[] arr=klass.getDeclaredMethods();
       
        for(Method next:arr){
            String modifiers=Modifier.toString(next.getModifiers());
            String methodname=next.getName();
            Class returntype=next.getReturnType();
        System.out.print(modifiers+" "+ returntype+" "+methodname+ "( " );
        Class []p=next.getParameterTypes();
       for(Class nx:p) {
            System.out.print(nx.getName()+" ,");
        }System.out.print(" )");
       System.out.println("");
        }
            
        }
    }