import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class X1 {
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
             Object x=  arr[0].invoke(user) ;
             System.out.println(x);
    }    
 }
// cook
// Exception in thread "main" java.lang.IllegalArgumentException: object of type User is not an instance of AA
//         at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.checkReceiver(DirectMethodHandleAccessor.java:198)
//         at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:99)
//         at java.base/java.lang.reflect.Method.invoke(Method.java:580)
//         at X1.main(X1.java:19)