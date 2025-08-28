public class create_ownException3 {
    
    public static void main(String[] args) {
        System.out.println("A");
        try{
  System.out.println(args[0]);}
  catch( ArrayIndexOutOfBoundsException x ){//conversion of exception
  throw new  NocommandLineArguementException();
}
        
        System.out.println("B");
    }}

// A
// Exception in thread "main" NocommandLineArguementException
//         at create_ownException3.main(create_ownException3.java:9)
