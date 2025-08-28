
public class K {
    static {
   System.out.println("AAA");
    }
    {
        System.out.println("CCC");
    }
    K(){
        System.out.println("BBB");
    }
    public static void main(String[] args) {
        System.out.println("main start ");
      // K x=new K();
      System.out.println("main end");
    }
}