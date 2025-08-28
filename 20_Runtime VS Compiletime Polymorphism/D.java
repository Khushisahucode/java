//runtime polymorphism
//dynamic method dispatch
class x1{
void pro(){
  System.out.println("hello.....");
}

}
class x2 extends x1{
    void pro(){
        System.out.println("hey....");
      }
}
class x3 extends x2{
    void pro(){
        System.out.println("namaste.....");
      }
}



public class D {
    public static void main(String[] args) {
        x1  y=new x2();
        y.pro();
         y =  new x3();
         y.pro();
         y.pro();

    }
    
}
