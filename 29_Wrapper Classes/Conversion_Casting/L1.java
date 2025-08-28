public class L1 {
    
   public static void main(String[]args){
       L1 a=new L1();
        a.pro((byte)20) ;
        a.show((short)20);
        a.process((char)20);
   }
void pro(Byte x){
  System.out.println(x);
}
void show(Short y){
  System.out.println(y);
}
void process(Character z){
System.out.println(z);
}
}
// 20
// 20
// ¶
