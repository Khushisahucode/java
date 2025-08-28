import java.lang.reflect.Constructor;
class F{
    public static void main(String[]args) throws SecurityException{
       DD x=new DD();
       Class klass =x.dd2.class;
        Construtor klass2=klass.getEnclosingConstructor();
        System.out.println(klass2.getName());
    }
}