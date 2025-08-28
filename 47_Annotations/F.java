class ff{
void process(String x,int y,float z){
    System.out.println("hi...");
}
}
class F extends ff{
    @Override
 void process(int x,String y,float z){
    System.out.println("hello.....");
 }
 public static void main(String[]args){
    F a=new F();
    a.process("om",45,56.7f);
 }
}
// F.java:7: error: method does not override or implement a method from a supertype
//     @Override
//     ^
// 1 error