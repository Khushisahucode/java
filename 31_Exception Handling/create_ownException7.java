public class create_ownException7 {
     public static void main(String[] args) {
        System.out.println("A");
        if(args.length>0){
            System.out.println(args[0]);
        }else{
  throw new  missingcommandLineArguementException();
        }System.out.println("B");
    }
}
class missingcommandLineArguementException extends RuntimeException {

}
// A
// Exception in thread "main" missingcommandLineArguementException
//         at create_ownException7.main(create_ownException7.java:7)
