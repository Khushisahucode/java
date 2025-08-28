public class create_ownException4 {
    
    public static void main(String[] args) {
        System.out.println("A");
        try{
  System.out.println(args[0]);}
  catch( ArrayIndexOutOfBoundsException x ){//Rethrowing of exception
  throw x;
}
        
        System.out.println("B");
}

}
// A
// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
//         at create_ownException4.main(create_ownException4.java:6)