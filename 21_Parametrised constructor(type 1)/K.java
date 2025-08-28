
class k1{
    k1(int x){
  System.err.println("hello......");
    }
}


public class K extends k1 {
  K(){
    super(pro());
  }
  static int  pro(){
    return 22;
 }
 public static void main(String[] args) {
     K x=new K();
     
 }
    
}