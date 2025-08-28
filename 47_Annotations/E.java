class ee{
void process(String x,int y,float z){
    System.out.println("hi...");
}
}
class E extends ee{
 void process(int x,String y,float z){
    System.out.println("hello.....");
 }
 public static void main(String[]args){
    E a=new E();
    a.process("om",45,56.7f);
 }
}//hi...