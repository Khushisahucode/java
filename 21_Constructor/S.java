class d1{
  private  int a=90;
    void aaa(){
    System.out.println("aaa() in s1......");
    }
     }
     class d2 extends d1{
    int b=56;
    void bbb(){
    System.out.println("bbb() in s2......");
    }
     }
     class d3 extends d2{
    char ch='h';
    void ccc(){
    System.out.println("ccc() in s3.......");
    }
     }
     
     
     public class S{
    public static void main(String[]args){
       d3 x=new d3() ;
      System.out.println(x.a);
      System.out.println(x.b);
      System.out.println(x.ch);
      x.aaa();
      x.bbb();
      x.ccc();
    
    }
    
    }
    /*
     * S.java:24: error: a has private access in d1
      System.out.println(x.a);
                          ^
1 error
     * 
     */
