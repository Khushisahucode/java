
    class x3{
        public  void show(){
            System.out.println("hello");
             }
            }
         
         public class L extends x3 {
           protected  void show(int x){
              System.out.println("hii");
             }
             public static void main(String[]args){
              L s=new L();
              s.show();
              s.show(7);
             }
         
    
    }
    

