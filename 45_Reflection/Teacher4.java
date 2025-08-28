import java.io.EOFException;
public class Teacher4 {
    String name;
   final static int add(int x,long z,String name) throws NumberFormatException{
        System.out.println("default method.add..."); 
        return x+(int)z;
    }
    public synchronized String go(int s1,String dob )throws EOFException,IndexOutOfBoundsException{
        System.out.println("public method..go.");
        return "..";
    }
 final private User cook(double d1,User u1)throws ClassNotFoundException{
        System.out.println("default method.cook...");
        return null;
    }
    private static float write()throws ArrayStoreException{
        System.out.println("public method..write.");
        return 0;
    }
}