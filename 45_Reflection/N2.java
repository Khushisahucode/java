import java.lang.reflect.Field;
public class N2 {
     public static void main(String[]args)throws IllegalAccessException{
        Class klass=student6.class;
        student6 s1=new student6("om",22,87,34000);
         student6 s2=new student6("khushi",23,95,100000);
        Field[] arr=klass.getDeclaredFields();
       
        for(Field next:arr){
        System.out.print(next.get(s1)+  ".....");
       
        }System.out.println("");
         for(Field next:arr){
        System.out.print(next.get(s2)+  ".....");
            
        }
    }
}
// om.....9.....34000.....87.0.....
// khushi.....9.....100000.....95.0.....