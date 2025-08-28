import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class W1 {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
        Teacher4 a = new Teacher4();
        a.name = "bharat";

        Teacher4 b = new Teacher4();
        b.name = "shtrughn";
        
        Class klass = Teacher4.class;

        Method[] arr = klass.getDeclaredMethods();
  arr[0].setAccessible(true);
   System.out.println(arr[0].getName());
        arr[0].invoke(a,34,"25-may-2003");
    }    
}
// go
// public method..go.