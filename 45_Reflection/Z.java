import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
public class Z{
    public static  String onlyType(String str){
   return str.substring((str.lastIndexOf("."))+1);
    }
     public static void main(String[]args)throws IllegalAccessException{
        Class klass=Skilled.class;
       
        Constructor[] arr=klass.getDeclaredConstructors();
       
        for(Constructor next:arr){
            String modifiers=Modifier.toString(next.getModifiers());
            String Constructorname=next.getName();
            
        System.out.print(modifiers+" "+" "+Constructorname+ "( " );
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

// protected  Skilled( String ,float ,double , )...............EOFException
// public  Skilled( Integer ,short , )...............IndexOutOfBoundsException
// private  Skilled( int ,float , )...............NumberFormatException
// public  Skilled( int , )...............ClassNotFoundException