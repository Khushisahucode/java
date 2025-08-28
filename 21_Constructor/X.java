
class v11{
    public   int a=90;
      private void aaa(){
      System.out.println("aaa() in s1......");
      System.out.println("value of a is :" + a);
      }
       }

       class v22 extends v11{
      int b=56;
      void bbb(){
      System.out.println("bbb() in s2......");
      }
       }

       class v33 extends v22{
      char ch='h';
      void ccc(){
      System.out.println("ccc() in s3.......");
      }
       }
       class X{
        public static void main(String[] args) {
            v33 x=new v33();
            
              //ok  
             // System.out.println(x.a);
                x.aaa();//not ok
               System.out.println(x.b);
               System.out.println(x.ch);
               
        }
       }/*
       X.java:29: error: cannot find symbol
                x.aaa();
                 ^
  symbol:   method aaa()
  location: variable x of type v33
1 error */