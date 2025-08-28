import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
public class S{
     public static void main(String[]args)throws IllegalAccessException{
        Class klass=Teacher3.class;
       
        Method[] arr=klass.getDeclaredMethods();
       
        for(Method next:arr){
            String modifiers=Modifier.toString(next.getModifiers());
            String methodname=next.getName();
            Class returntype=next.getReturnType();
        System.out.print(modifiers+" "+ returntype+" "+methodname+ "( " );
        Class []parametretype=next.getParameterTypes();
        Class []exceptiontype=next.getExceptionTypes();
        for(Class nx:parametretype) {
            System.out.print(nx.getName()+" ,");
        }System.out.print(" )"+"...............");

        for(Class E:exceptiontype){
            System.out.print(E.getName());
        }
       System.out.println("");
        }
            
        }
    }
//     final class User cook( double ,User , )...............java.lang.ClassNotFoundException
// public synchronized class java.lang.String go( int ,java.sql.Date , )...............java.io.EOFExceptionjava.lang.IndexOutOfBoundsException
// static final void add( int ,float ,java.lang.String , )...............java.lang.NumberFormatException
// public static float write(  )...............java.lang.ArrayStoreException