public class S{
  public static void main(String[] args) {
      
    // ------> INternally  in compilor 
    //Byte a=Byte.valueOf((byte)36);
    Byte a=36;
      pro(a);
  } //unboxing
   static void pro(byte x){
    System.out.println(x);
  }
//    output : 36 
}
