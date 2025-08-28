
import java.io.EOFException;
import java.sql.Date;
public class Teacher3 {
    String name;
   final static void add(int x,float z,String name) throws NumberFormatException{
        System.out.println("default method.add...");
    }
    public synchronized String go(int s1,Date dob )throws EOFException,IndexOutOfBoundsException{
        System.out.println("public method..go.");
        return "..";
    }
 final  User cook(double d1,User u1)throws ClassNotFoundException{
        System.out.println("default method.cook...");
        return null;
    }
    public static float write()throws ArrayStoreException{
        System.out.println("public method..write.");
        return 0;
    }
}

