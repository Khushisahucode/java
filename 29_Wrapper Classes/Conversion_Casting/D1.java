public class D1 {
    
    public static void main(String[]args){
       D1 a=new D1();
         System.out.println("value of x : "+a.pro((byte)20) );
        System.out.println("value of y : "+ a.show((short)20));
    System.out.println("value of z : "+ a.process((char)20));
   }
int pro(byte x){
return x;
}
int show(short y){
  return y;
}
int process(char z){
  return z;
}
} 
// value of x : 20
// value of y : 20
// value of z : 20
