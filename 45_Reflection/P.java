import java.lang.reflect.Method;
public class P {
     public static void main(String[]args)throws IllegalAccessException{
        Class klass=Teacher2.class;
       
        Method[] arr=klass.getDeclaredMethods();
       
        for(Method next:arr){
        System.out.println(next.getName()+  ".....");
       
        }
            
        }
    }
//     cook.....
// go.....
// add.....
// write.....