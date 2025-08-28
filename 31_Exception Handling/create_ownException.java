public class create_ownException {
    public static void main(String[] args) {
        System.out.println("A");
        if(args.length>0){
            System.out.println(args[0]);
        }else{
  throw new  NocommandLineArguementException();
        }System.out.println("B");
    }
}
class NocommandLineArguementException extends RuntimeException {

}
// A
// Exception in thread "main" NocommandLineArguementException
//         at create_ownException.main(create_ownException.java:7)
