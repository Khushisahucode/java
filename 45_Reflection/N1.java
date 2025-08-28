import java.lang.reflect.Field;
public class N1 {
     public static void main(String[]args)throws IllegalAccessException{
        Class klass=student5.class;
        student5 s1=new student5("om",22,87,34000);
         student5 s2=new student5("khushi",23,95,100000);
        Field[] arr=klass.getDeclaredFields();
       
        for(Field next:arr){
        System.out.print(next.get(s1)+  ".....");
       
        }System.out.println("");
         for(Field next:arr){
        System.out.print(next.get(s2)+  ".....");
            
        }
    }
}
// om.....22.....Exception in thread "main" java.lang.IllegalAccessException: class N1 cannot access a member of class student5 with modifiers "private"
//         at java.base/jdk.internal.reflect.Reflection.newIllegalAccessException(Reflection.java:398)
//         at java.base/java.lang.reflect.AccessibleObject.checkAccess(AccessibleObject.java:709)
//         at java.base/java.lang.reflect.Field.checkAccess(Field.java:1156)
//         at java.base/java.lang.reflect.Field.get(Field.java:441)
//         at N1.main(N1.java:10)