import java.lang.reflect.Method;
class E{
    public static void main(String[]args) throws SecurityException{
        Class klass=DD.pro();
        Method klass2=klass.getEnclosingMethod();
        System.out.println(klass2.getName());
    }
}
//pro()