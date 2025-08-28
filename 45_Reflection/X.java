import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class X {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
        Teacher4 a = new Teacher4();
        a.name = "bharat";

        Teacher4 b = new Teacher4();
        b.name = "shtrughn";
        
        Class klass = Teacher4.class;

        Method[] arr = klass.getDeclaredMethods();
  arr[0].setAccessible(true);
   System.out.println(arr[0].getName());
      
        
             Object x=  arr[0].invoke(a,34,2349089l,"Om") ;
             System.out.println(x);
    }    
}
// add
// default method.add...
// 2349123