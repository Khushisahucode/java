public class E1 {
     //Assignment operator ---------->no

    public static void main(String[]args){
       E1 a=new E1();
        a.pro((byte)20) ;
        a.show((short)20);
    a.process((char)20);
   }
void pro(byte x){
  System.out.println(x);
}
void show(short y){
  System.out.println(y);
}
void process(char z){
System.out.println(z);
}
} 

// output :
// 20
// 20
// ¶