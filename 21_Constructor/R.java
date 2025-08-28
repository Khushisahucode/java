class s11{
    
     s11(){
    System.out.println("M...");
    }
     }
     class s22 extends s11{
    
     s22(){
    System.out.println("A......");
    }
     }
     class s33 extends s22{
    
     s33(){
    System.out.println("U.......");
    }
     }
     
     
     public class R{
    public static void main(String[]args){
      System.out.println("R");
      s33 x=new s33() ;
      
      System.out.println("G");
      
    }
    
    }
