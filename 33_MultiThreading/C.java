public class C {
    public static void main(String[] args) {
      Thread x= Thread.currentThread()  ;
      System.out.println( x +"-"+x.getId());
      AAA();
    }
    static void AAA(){
Thread x= Thread.currentThread()  ;
      System.out.println( x +"-"+x.getId());
      BBB();
    }
static void BBB(){
        Thread x= Thread.currentThread()  ;
      System.out.println( x +"-"+x.getId());
      CCC();
    }
    static void CCC(){
        Thread x= Thread.currentThread()  ;
      System.out.println( x +"-"+x.getId());
    
    }

}
// Thread[#1,main,5,main]-1
// Thread[#1,main,5,main]-1
// Thread[#1,main,5,main]-1
// Thread[#1,main,5,main]-1