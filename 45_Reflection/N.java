import java.lang.reflect.Field;
public class N {
     public static void main(String[]args)throws IllegalAccessException{
        Class klass=student4.class;
        student4 s1=new student4("om",22,87);
         student4 s2=new student4("khushi",23,95);
        Field[] arr=klass.getDeclaredFields();
       
        for(Field next:arr){
        System.out.print(next.get(s1)+  ".....");
       
        }System.out.println("");
         for(Field next:arr){
        System.out.print(next.get(s2)+  ".....");
            
        }
    }
}
// om.....22.....87.0.....
// khushi.....23.....95.0.....