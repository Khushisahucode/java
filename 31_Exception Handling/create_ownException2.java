public class create_ownException2 {
    public static void main(String[] args) {
        System.out.println("A");
        if(args.length>0){
            System.out.println(args[0]);
        }else{
            try{
  throw new  NocommandLineArguementException();}
  catch( NocommandLineArguementException x ){
System.out.println("problm solved ");}
        }
        System.out.println("B");
    }
}
// PPS C:\Users\sahuj\java coaching code\31_Exception Handling> java create_ownException2      
// A
// problm solved

