public class create_ownException8 {
    public static void main(String[] args) {
        System.out.println("A");
        if(args.length>0){
            System.out.println(args[0]);
        }else{
  throw new  NocommandLineArguementException( "gapla ho gaya ");
        }System.out.println("B");
    }
}
class NocommandLineArguementException extends RuntimeException {

    NocommandLineArguementException (){

    }
NocommandLineArguementException (String message){
        super(message);
    }

}

// A
// Exception in thread "main" NocommandLineArguementException: gapla ho gaya 
//         at create_ownException8.main(create_ownException8.java:7)

     
    
