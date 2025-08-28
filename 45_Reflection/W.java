import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class W {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
        Teacher4 a = new Teacher4();
        a.name = "bharat";

        Teacher4 b = new Teacher4();
        b.name = "shtrughn";
        
        Class klass = Teacher4.class;

        Method[] arr = klass.getDeclaredMethods();

        arr[0].invoke(a);
    }    
}
// Exception in thread "main" java.lang.IllegalArgumentException: wrong number of arguments: 0 expected: 3
        // at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.checkArgumentCount(DirectMethodHandleAccessor.java:330)
        // at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:101)
        // at java.base/java.lang.reflect.Method.invoke(Method.java:580)
        // at W.main(W.java:16)