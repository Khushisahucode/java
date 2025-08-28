class aa{
void process(){
    System.out.println("hi...");
}
}
class A extends aa{
 void pracess(){
    System.out.println("hello.....");
 }
 public static void main(String[]args){
    A a=new A();
    a.process();
 }
}//hi...