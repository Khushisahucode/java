class cc{
void process(){
    System.out.println("hi...");
}
}
class C extends cc{
    @Override
 void pracess(){
    System.out.println("hello.....");
 }
 public static void main(String[]args){
    C a=new C();
    a.process();
 }
}//hi...
// C.java:7: error: method does not override or implement a method from a supertype
//     @Override
//     ^
// 1 error