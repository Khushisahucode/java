

interface z1{
     void aaa();
}
public class A {
    static z1 z=new z1(){
        public void aaa(){
           System.out.println("hello from aaa()......");
           bbb();
        }
        private void bbb(){
    System.out.println("hello from bbb()......");
        }
    };
    public static void main(String[] args) {
       z. aaa();
      A.z.aaa();
    }
}
