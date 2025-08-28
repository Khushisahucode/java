  
  // Stack Trace
  class y1{
      int a=90;
      void aaa(){
      System.out.println("aaa() in s1......");
      System.out.println("value of a is :" + a);
      }
       }
       class y2 extends y1{
      int b=56/0;
      void bbb(){
      System.out.println("bbb() in s2......");
      }
       }
       class y3 extends y2{
      char ch='h';
      void ccc(){
      System.out.println("ccc() in s3.......");
      }
       }
        public class stack_trace{
      public static void main(String[]args){
         y3 x=new y3() ;
      System.out.println(x.a);
         x.aaa();
        System.out.println(x.b);
        System.out.println(x.ch);
        
      }
    }
    /*
     Exception in thread "main" java.lang.ArithmeticException: / by zero
        at y2.<init>(stack_trace.java:11)
        at y3.<init>(stack_trace.java:16)
        at stack_trace.main(stack_trace.java:24)

     */