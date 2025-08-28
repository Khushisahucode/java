public class J {
    static {
   System.out.println("AAA");
    }
    {
        System.out.println("CCC");
    }
    J(){
        System.out.println("BBB");
    }
    public static void main(String[] args) {
        System.out.println("main start ");
        J x=new J();
      System.out.println("main end");
    }
}
