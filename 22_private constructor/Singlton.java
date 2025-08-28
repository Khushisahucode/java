
// Singlton........class 
 final class s {
    private static  s x  ;
    private s() {
 
    }
    public static s getinstance(){
      if(x==null){
        x =new s();
      }
        return x;
      
    }
}
 public class Singlton {
   public static void main(String[] args) {
      s a=  s.getinstance();
      s b=  s.getinstance();
     s c=   s.getinstance();
      System.out.println("value of a :"+a);
      System.out.println("value of b :"+b);
      System.out.println("value of c :"+c);
      System.out.println(System.console());
      System.out.println(System.console());
      System.out.println(System.console());
      System.out.println(System.console());
    
    }
 }
    
