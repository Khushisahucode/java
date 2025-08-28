import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
public class T{
    public static  String onlyType(String str){
   return str.substring((str.lastIndexOf("."))+1);
    }
     public static void main(String[]args)throws IllegalAccessException{
        Class klass=Teacher3.class;
       
        Method[] arr=klass.getDeclaredMethods();
       
        for(Method next:arr){
            String modifiers=Modifier.toString(next.getModifiers());
            String methodname=next.getName();
            String returntype=onlyType(next.getReturnType().getName());
        System.out.print(modifiers+" "+ returntype+" "+methodname+ "( " );
        Class []parametretype=next.getParameterTypes();
        Class []exceptiontype=next.getExceptionTypes();
        for(Class nx:parametretype) {
            System.out.print(onlyType(nx.getName())+" ,");
        }System.out.print(" )"+"...............");

        for(Class E:exceptiontype){
            System.out.print(onlyType(E.getName()));
        }
       System.out.println("");
        }
            
        }
    }
//     final User cook( double ,User , )...............ClassNotFoundException
// public synchronized String go( int ,Date , )...............EOFExceptionIndexOutOfBoundsException
// static final void add( int ,float ,String , )...............NumberFormatException
// public static float write(  )...............ArrayStoreException