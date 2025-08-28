import java.io.EOFException;
public class Skilled extends User{
   public Skilled(int x) throws ClassNotFoundException{
   System.out.println("java.....");
    }
   private Skilled(int x,float y)throws NumberFormatException{
 System.out.println("css.....");
    }
   public  Skilled(Integer x,short y)throws IndexOutOfBoundsException{
 System.out.println("python....");
    }
   protected Skilled(String name,float y,double d)throws EOFException{
 System.out.println("HTML.....");
    }
}
