public class create_ownException5 {
     public static void main(String[] args) {
        System.out.println("A");
        try{
throw new ArithmeticException("ghapla ho gaya");}
  catch( ArithmeticException x ){
System.out.println(x.getMessage());
    }
  }
}
// A
// ghapla ho gaya
