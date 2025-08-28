public class student {
    static int age =15;
    String name ="khushi";
    static int maxage =50;
public static void main(String[] args) {
   student s=new student () ;
   maxage=25;
    s.showinfo();
    s.name="madhu";
    age=22;
    s.showinfo();
}
void showinfo()
{
    
    
    System.out.print(" student age is = ");
    System.out.println(age);

    System.out.print("student maximum age is = ");
    System.out.println(maxage);
    System.out.print(" student name is = ");
     System.out.println(name);
    
}
}
