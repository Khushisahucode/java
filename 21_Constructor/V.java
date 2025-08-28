class v1{
    private  int a=90;
      void aaa(){
      System.out.println("aaa() in s1......");
      System.out.println("value of a is :" + a);
      }
       }
       class v2 extends v1{
      int b=56;
      void bbb(){
      System.out.println("bbb() in s2......");
      }
       }
       class v3 extends v2{
      char ch='h';
      void ccc(){
      System.out.println("ccc() in s3.......");
      }
       }
       
       
       public class V{
      public static void main(String[]args){
         v3 x=new v3() ;
      //  System.out.println(x.a);
         x.aaa();
        System.out.println(x.b);
        System.out.println(x.ch);
        
    
      
      
      }
      
      }
      

  
