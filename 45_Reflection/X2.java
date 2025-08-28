import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
class X2 {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
        AA a = new AA();
        a.name = "bharat";

        AA b = new AA();
        b.name = "shtrughn";
        
        Class klass = AA.class;

        Method[] arr = klass.getDeclaredMethods();
  arr[0].setAccessible(true);
   System.out.println(arr[0].getName());
      
            User user=new User();
             Object x=  arr[0].invoke(a) ;
             System.out.println(x);
    }    
 }
//  write
// public method..write.
// Exception in thread "main" java.lang.reflect.InvocationTargetException
//         at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:118)
//         at java.base/java.lang.reflect.Method.invoke(Method.java:580)
//         at X2.main(X2.java:18)
// Caused by: java.lang.ArithmeticException: / by zero
//         at AA.write(AA.java:13)
//         at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
//         ... 2 more