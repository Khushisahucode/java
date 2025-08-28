   class x1{
    public  void show(){
        System.out.println("hello");
         }
        }
     
     public class K extends x1 {
         void show(int x){
          System.out.println("hii");
         }
         public static void main(String[]args){
          K s=new K();
          s.show();
          s.show(7);
         }
     

}
