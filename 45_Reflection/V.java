import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
class V {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
        Teacher3 a = new Teacher3();
        a.name = "bharat";

        Teacher3 b = new Teacher3();
        b.name = "shtrughn";
        
        Class klass = Teacher3.class;

        Method[] arr = klass.getDeclaredMethods();

        arr[0].invoke(a);
    }    
}
// Exception in thread "main" java.lang.IllegalArgumentException: wrong number of arguments: 0 expected: 2
//         at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.checkArgumentCount(DirectMethodHandleAccessor.java:330)
//         at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:101)
//         at java.base/java.lang.reflect.Method.invoke(Method.java:580)
//         at V.main(V.java:15)