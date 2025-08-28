class j1{
  static  void show(){
   System.out.println("hello");
    }
}

public class J extends j1 {
    void show(int x){
     System.out.println("hii");
    }
    public static void main(String[]args){
     J s=new J();
     s.show();
     s.show(4);
    }


}
// legal  case of  method overloading